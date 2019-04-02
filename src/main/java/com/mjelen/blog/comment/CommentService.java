package com.mjelen.blog.comment;

import com.mjelen.blog.comment.Comment;

import java.util.Optional;

public interface CommentService {
    void save(Comment comment);

    Optional<Comment> findById(Long id);

    void deleteById(Long id);
}
