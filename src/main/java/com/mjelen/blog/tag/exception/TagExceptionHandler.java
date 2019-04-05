package com.mjelen.blog.tag.exception;

import com.mjelen.blog.tag.response.TagErrorRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class TagExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<TagErrorRes> tagNotFound(TagNotFoundException ex) {
        TagErrorRes error = TagErrorRes.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
