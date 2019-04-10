package com.mjelen.blog.comment;

import com.mjelen.blog.post.Post;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    void save(Comment comment);

    Optional<Comment> findById(Long id);

    void deleteById(Long id);

    void deleteById(Post post, Comment comment);

    void save(Post post, Comment comment);

    List<Comment> findCommentsForPost(Long postId);
}
