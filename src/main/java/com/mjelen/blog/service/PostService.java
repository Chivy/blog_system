package com.mjelen.blog.service;

import com.mjelen.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository posts;

    @Autowired
    public PostService(PostRepository posts) {
        this.posts = posts;
    }
}
