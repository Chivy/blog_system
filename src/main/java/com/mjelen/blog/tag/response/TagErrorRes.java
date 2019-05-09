package com.mjelen.blog.tag.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagErrorRes {
    private int status;
    private String message;
    private LocalDateTime timestamp;
}
