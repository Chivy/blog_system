package com.mjelen.blog.account.user;

import com.mjelen.blog.account.validation.PasswordMatches;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@PasswordMatches
public class UserDTO {

    @NotBlank(message = "Username cannot be empty")
    private String username;

    @NotBlank(message = "Password cannot be empty")
    @Length(min = 6)
    private String password;

    @NotBlank(message = "Matching password cannot be empty")
    @Length(min = 6)
    private String matchingPassword;

    @Email
    @NotBlank(message = "E-mail cannot be empty")
    private String email;
}
