package com.mjelen.blog.controller;

import com.mjelen.blog.entity.Post;
import com.mjelen.blog.exception.PostNotFoundException;
import com.mjelen.blog.service.CommentService;
import com.mjelen.blog.service.PostService;
import com.mjelen.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;


    @Autowired
    public PostController(PostService postService, CommentService commentService, UserService userService) {
        this.postService = postService;

    }

    @GetMapping("/all")
    public ResponseEntity<List<Post>> findAllPosts() {
        return new ResponseEntity<>(postService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> findPostById(@PathVariable Long id) {
        return new ResponseEntity<>(
                postService.findById(id).orElseThrow(
                        () -> new PostNotFoundException("Post not found, id: " + id)
                ), HttpStatus.FOUND);
    }

    @PostMapping("/")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return new ResponseEntity<>(postService.save(post), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> deletePostById(@PathVariable Long id) {
        Post deleted = postService.findById(id).orElseThrow(
                () -> new PostNotFoundException("Post not found, id: " + id)
        );

        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }
}
