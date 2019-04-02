package com.mjelen.blog.comment.exception;

import com.mjelen.blog.comment.response.CommentErrorRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CommentExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CommentErrorRes> commentNotFound(CommentNotFoundException ex) {
        CommentErrorRes commentErrorRes = CommentErrorRes.builder()
                .message(ex.getMessage())
                .statusCode(HttpStatus.NOT_FOUND.value())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(commentErrorRes, HttpStatus.NOT_FOUND);
    }
}
