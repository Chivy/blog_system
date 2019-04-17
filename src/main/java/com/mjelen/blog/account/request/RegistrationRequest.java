package com.mjelen.blog.account.request;

import com.mjelen.blog.account.validation.PasswordMatches;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@RequiredArgsConstructor
@PasswordMatches
public class RegistrationRequest {

    @NotBlank
    private final String username;

    @NotBlank
    @Size(min = 6, max = 12)
    private final String password;

    @NotBlank
    @Size(min = 6, max = 12)
    private final String matchingPassword;

    @NotBlank
    @Email
    private final String email;
}
