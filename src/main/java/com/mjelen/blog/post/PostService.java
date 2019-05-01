package com.mjelen.blog.post;

import com.mjelen.blog.account.user.User;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> findAll();

    Optional<Post> findById(Long id);

    List<Post> findThreeLastPosts();

    Post save(Post post, User user);

    void deleteById(Long id);
}
