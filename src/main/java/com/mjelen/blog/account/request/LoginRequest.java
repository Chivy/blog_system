package com.mjelen.blog.account.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@RequiredArgsConstructor
public class LoginRequest {

    @NotBlank
    private final String usernameOrEmail;

    @NotBlank
    private final String password;
}
