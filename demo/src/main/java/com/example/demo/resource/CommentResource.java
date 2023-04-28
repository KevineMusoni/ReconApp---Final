package com.example.demo.resource;

import com.example.demo.model.Response;
import com.example.demo.service.implementation.CommentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentResource {

    private final CommentServiceImpl commentService;

    @GetMapping("/list")
    public ResponseEntity<Response> getComments() throws InterruptedException{
        TimeUnit.SECONDS.sleep(1);
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("comment", commentService.list(50000)))
                        .message("Comments retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @GetMapping("/get/{row_id}")
    public ResponseEntity<Response> getComment(@PathVariable("row_id") long row_id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("comment",commentService.get(row_id)))
                        .message("Comments retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
// update an existing comment
    @PostMapping("/update/{row_id}")
    public ResponseEntity<Response> updateReconFields(@PathVariable("row_id") long row_id,
                                                      @RequestBody Map<String, String> reconFields) {
        commentService.updateReconFields(row_id, reconFields.get("RECON_COMMENTS"),
                reconFields.get("RECON_USER"), reconFields.get("DS_A_STATUS_FLAG"));
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("row_id", row_id))
                        .message("Recon fields updated successfully for comment with id " + row_id)
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }


}


