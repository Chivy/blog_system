package com.mjelen.blog.controller;

import com.mjelen.blog.entity.Post;
import com.mjelen.blog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    private PostService postService;

    @GetMapping("/")
    public ResponseEntity<List<Post>> showLastThreePosts() {
        return new ResponseEntity<>(
                postService.findThreeLastPosts(), HttpStatus.OK
        );
    }
}
