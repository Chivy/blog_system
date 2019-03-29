package com.mjelen.blog.service;

import com.mjelen.blog.entity.Post;
import com.mjelen.blog.exception.PostNotFoundException;
import com.mjelen.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    private PostRepository posts;

    @Autowired
    public PostServiceImpl(PostRepository posts) {
        this.posts = posts;
    }

    @Override
    public List<Post> findAll() {
        return posts.findAll();
    }

    @Transactional
    @Override
    public Optional<Post> findById(Long id) {
        return posts.findById(id);
    }

    @Override
    public List<Post> findThreeLastPosts() {
        return posts.findFirst3ByCreationDate(LocalDateTime.now());
    }

    @Override
    @Transactional
    public Post save(Post post) {
        return posts.save(post);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        posts.deleteById(id);
    }
}
