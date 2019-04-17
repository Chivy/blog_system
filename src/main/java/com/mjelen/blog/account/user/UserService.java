package com.mjelen.blog.account.user;

import java.util.Collection;
import java.util.Optional;

public interface UserService {

    Optional<User> findById(Long id);

    Collection<User> findAll();

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
