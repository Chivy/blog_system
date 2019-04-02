package com.mjelen.blog.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor @AllArgsConstructor
@Builder
public class CommentErrorRes {
    private String message;
    private int statusCode;
    private LocalDateTime timestamp;
}
