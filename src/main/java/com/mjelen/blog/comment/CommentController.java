package com.mjelen.blog.comment;

import com.mjelen.blog.comment.exception.CommentNotFoundException;
import com.mjelen.blog.post.Post;
import com.mjelen.blog.post.PostService;
import com.mjelen.blog.post.exception.PostNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts/{postId}/comments")
public class CommentController {

    private CommentService commentService;
    private PostService postService;

    @Autowired
    public CommentController(CommentService commentService, PostService postService) {
        this.commentService = commentService;
        this.postService = postService;
    }

    @PostMapping("/")
    public ResponseEntity<Comment> addCommentForPost(@PathVariable Long postId, @RequestBody Comment comment) {
        Post post = postService.findById(postId).orElseThrow(
                () -> new PostNotFoundException("Post with id:" + postId + "doesn't exist")
        );

        commentService.save(post, comment);
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Comment> deleteCommentById(@PathVariable Long commentId, @PathVariable Long postId) {
        Post post = postService.findById(postId)
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + "doesn't exist"));

        Comment comment = commentService.findById(commentId)
                .orElseThrow(() -> new CommentNotFoundException("Comment with id: " + commentId + "doesn't exist"));


        commentService.deleteById(post, comment);

        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @DeleteMapping("/deleteAll")
    public void deleteCommentsFromPost(@PathVariable Long postId) {
        Post post = postService.findById(postId)
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + "doesn't exist"));


    }

    @PutMapping("/{commentId}")
    public ResponseEntity<Comment> updateCommentById(@PathVariable Long commentId, @RequestBody Comment reqComment,
                                                     @PathVariable Long postId) {
        Post post = postService.findById(postId)
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + "doesn't exist"));

        Comment comment = commentService.findById(commentId)
                .orElseThrow(() -> new CommentNotFoundException("Comment with id: " + commentId + "doesn't exist"));

        commentService.save(post, comment);

        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Comment>> findCommentsForPost(@PathVariable Long postId) {
        return new ResponseEntity<>(
                commentService.findCommentsForPost(postId), HttpStatus.FOUND);
    }
}
