package com.mjelen.blog.controller;

import com.mjelen.blog.service.CommentService;
import com.mjelen.blog.service.PostService;
import com.mjelen.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;
    private CommentService commentService;
    private UserService userService;


}
