package com.mjelen.blog.post;

import com.mjelen.blog.account.authentication.AuthenticatedUser;
import com.mjelen.blog.account.user.User;
import com.mjelen.blog.account.user.UserPrincipal;
import com.mjelen.blog.account.user.UserService;
import com.mjelen.blog.post.exception.PostNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final UserService userService;

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
    public ResponseEntity<Post> createPost(@RequestBody Post post, @AuthenticatedUser UserPrincipal userPrincipal) {
        User user = userService.findByUsername(userPrincipal.getUsername())
                .orElseThrow(
                        () -> new UsernameNotFoundException("User not found")
                );

        return new ResponseEntity<>(
                postService.save(post, user), HttpStatus.CREATED
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Post> deletePostById(@PathVariable Long id) {
        Post deleted = postService.findById(id).orElseThrow(
                () -> new PostNotFoundException("Post not found, id: " + id)
        );

        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Post> updatePost(@RequestBody Post post, @AuthenticatedUser UserPrincipal userPrincipal) {
        User user = userService.findByUsername(userPrincipal.getUsername())
                .orElseThrow(
                        () -> new UsernameNotFoundException("User not found")
                );

        postService.save(post, user);

        return new ResponseEntity<>(post, HttpStatus.OK);
    }
}
