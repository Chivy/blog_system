package com.mjelen.blog.account.user;

import com.mjelen.blog.account.request.RegistrationRequest;

import java.util.Collection;
import java.util.Optional;

public interface UserService {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    Collection<User> findAll();

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    User registerUser(RegistrationRequest registrationRequest);
}
