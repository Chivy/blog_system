package com.mjelen.blog.service;

import com.mjelen.blog.entity.Comment;

import java.util.Optional;

public interface CommentService {
    void save(Comment comment);

    Optional<Comment> findById(Long id);

    void deleteById(Long id);
}
