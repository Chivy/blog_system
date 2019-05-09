package com.mjelen.blog.post;

import com.mjelen.blog.account.authentication.AuthenticatedUser;
import com.mjelen.blog.account.user.User;
import com.mjelen.blog.account.user.UserPrincipal;
import com.mjelen.blog.account.user.UserService;
import com.mjelen.blog.post.exception.PostNotFoundException;
import com.mjelen.blog.tag.Tag;
import com.mjelen.blog.tag.TagService;
import com.mjelen.blog.tag.exception.TagNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriUtils;

import java.nio.charset.StandardCharsets;
import java.util.List;


@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final UserService userService;
    private final TagService tagService;

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

    @GetMapping("/tags")
    public ResponseEntity<List<Post>> findPostsByTag(@RequestParam(name = "name") String tagName) {
        String encodedParam = UriUtils.encode(tagName, StandardCharsets.UTF_8);

        Tag tag = tagService.findByName(encodedParam)
                .orElseThrow(
                        () -> new TagNotFoundException("Tag with name: " + tagName + "not found"));

        List<Post> posts = postService.findByTagName(tag);

        if (posts.isEmpty()) {
            throw new PostNotFoundException("There are no posts with tag: " + tagName);
        }

        return new ResponseEntity<>(posts, HttpStatus.FOUND);
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
        postService.delete(deleted);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Post> updatePost(@RequestBody Post post, @AuthenticatedUser UserPrincipal userPrincipal) {
        User user = userService.findByUsername(userPrincipal.getUsername())
                .orElseThrow(
                        () -> new UsernameNotFoundException("User not found")
                );

        postService.save(post, user);

        return new ResponseEntity<>(post, HttpStatus.OK);
    }

    @PutMapping("/{postId}/tags")
    public ResponseEntity<Post> addTagsToPost(@PathVariable Long postId, @RequestParam(name = "name") String... names) {
        Post post = postService.findById(postId)
                .orElseThrow(
                        () -> new PostNotFoundException("Post with id: " + postId + "doesn't exist")
                );

        return new ResponseEntity<>(
                postService.addTags(post, names), HttpStatus.OK);
    }

}
