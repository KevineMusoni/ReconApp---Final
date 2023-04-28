package com.example.demo.service.implementation;

import com.example.demo.model.Comment;
import com.example.demo.repo.CommentRepo;
import com.example.demo.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class CommentServiceImpl implements CommentService {
    private final CommentRepo commentRepo;

    @Override
    public List<Comment> list(int limit){
        log.info("Fetching all Comments");
        return commentRepo.findAll(of(0,limit)).toList();
    }

    @Override
    public Comment get(Long row_id) {
        log.info("Fetching all comments by id:{}", row_id);
        Optional<Comment> comment = commentRepo.findById(row_id);
        if (comment.isPresent()) {
            return comment.get();
        } else {
            throw new CommentServiceImpl.CommentNotFoundException("Comment not found with id " + row_id);
        }
    }

    public static class CommentNotFoundException extends RuntimeException {
        public CommentNotFoundException(String message) {
            super(message);
        }
    }

    @Override
    public Comment update(Comment comment) {
        return null;
    }

    @Override
    public void updateReconFields(Long row_id, String RECON_COMMENTS, String RECON_USER, String DS_A_STATUS_FLAG) {
        log.info("Updating Recon fields for Comment with id:{}", row_id);
        Optional<Comment> commentOptional = commentRepo.findById(row_id);
        if (commentOptional.isPresent()) {
            Comment comment = commentOptional.get();
            comment.setRECON_COMMENTS(RECON_COMMENTS);
            comment.setRECON_USER(RECON_USER);
            comment.setDS_A_STATUS_FLAG(DS_A_STATUS_FLAG);
            commentRepo.save(comment);
        } else {
            throw new CommentNotFoundException("Comment not found with id " + row_id);
        }
    }



}
