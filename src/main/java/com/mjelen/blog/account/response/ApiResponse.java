package com.mjelen.blog.account.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ApiResponse {
    private final boolean success;
    private final String message;
}
