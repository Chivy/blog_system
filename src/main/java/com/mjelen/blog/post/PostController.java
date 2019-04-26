package com.mjelen.blog.post;

import com.mjelen.blog.post.exception.PostNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
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

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return new ResponseEntity<>(postService.save(post), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Post> deletePostById(@PathVariable Long id) {
        Post deleted = postService.findById(id).orElseThrow(
                () -> new PostNotFoundException("Post not found, id: " + id)
        );

        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Post> updatePost(@RequestBody Post post) {
        postService.save(post);

        return new ResponseEntity<>(post, HttpStatus.OK);
    }
}
