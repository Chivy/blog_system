package com.mjelen.blog.post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> findAll();

    Optional<Post> findById(Long id);

    List<Post> findThreeLastPosts();

    Post save(Post post);

    void deleteById(Long id);
}
