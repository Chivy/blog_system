package com.mjelen.blog.home;

import com.mjelen.blog.post.Post;
import com.mjelen.blog.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {

    private final PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> showLastThreePosts() {
        return new ResponseEntity<>(
                postService.findThreeLastPosts(), HttpStatus.OK
        );
    }
}
