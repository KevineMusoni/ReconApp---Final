package com.example.demo.service;

import com.example.demo.model.Comment;
import com.example.demo.model.Items;

import java.util.List;

public interface CommentService {
    List<Comment> list(int limit);
    Comment get(Long row_id);
    Comment update(Comment comment);
    void updateReconFields(Long row_id, String RECON_COMMENTS, String RECON_USER, String DS_A_STATUS_FLAG);

}
