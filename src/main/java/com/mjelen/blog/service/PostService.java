package com.mjelen.blog.service;

import com.mjelen.blog.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> findAll();

    Optional<Post> findById(Long id);

    List<Post> findThreeLastPosts();

    Post save(Post post);

    void deleteById(Long id);
}
