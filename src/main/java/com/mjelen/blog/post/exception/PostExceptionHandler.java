package com.mjelen.blog.post.exception;

import com.mjelen.blog.post.response.PostErrorRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class PostExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<PostErrorRes> postNotFound(PostNotFoundException ex) {
        PostErrorRes postErrorRes = PostErrorRes.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(postErrorRes, HttpStatus.NOT_FOUND);
    }
}
