package com.mjelen.blog.controller;

import com.mjelen.blog.entity.Comment;
import com.mjelen.blog.entity.Post;
import com.mjelen.blog.exception.CommentNotFoundException;
import com.mjelen.blog.exception.PostNotFoundException;
import com.mjelen.blog.service.CommentService;
import com.mjelen.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

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

        post.addComment(comment);
        comment.setPost(post);

        commentService.save(comment);
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Comment> deleteCommentById(@PathVariable Long commentId, @PathVariable Long postId) {
        Post post = postService.findById(postId)
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + "doesn't exist"));

        Comment comment = commentService.findById(commentId)
                .orElseThrow(() -> new CommentNotFoundException("Comment with id: " + commentId + "doesn't exist"));

        comment.setPost(null);
        post.deleteComment(comment);

        postService.save(post);
        commentService.deleteById(commentId);

        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<Comment> updateCommentById(@PathVariable Long commentId, @RequestBody Comment reqComment,
                                                     @PathVariable Long postId) {
        Post post = postService.findById(postId)
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + postId + "doesn't exist"));

        Comment comment = commentService.findById(commentId)
                .orElseThrow(() -> new CommentNotFoundException("Comment with id: " + commentId + "doesn't exist"));


        comment.setContent(reqComment.getContent());
        comment.setLastUpdatedDate(LocalDateTime.now());

        post.deleteComment(comment);
        post.addComment(comment);

        postService.save(post);
        commentService.save(comment);

        return new ResponseEntity<>(comment, HttpStatus.OK);
    }
}
