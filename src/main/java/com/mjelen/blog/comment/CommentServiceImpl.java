package com.mjelen.blog.comment;

import com.mjelen.blog.post.Post;
import com.mjelen.blog.post.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService{

    private CommentRepository commentRepository;
    private PostRepository postRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public void deleteById(Post post, Comment comment) {
        post.deleteComment(comment);

        commentRepository.deleteById(comment.getId());
        postRepository.save(post);
    }

    @Override
    public void save(Post post, Comment comment) {

        if (comment.getId() != null) {
            post.deleteComment(comment);
            post.addComment(comment);
        }
        else {
            post.addComment(comment);
            comment.setPost(post);
        }

        commentRepository.save(comment);
        postRepository.save(post);
    }

    @Override
    public List<Comment> findCommentsForPost(Long postId) {
        Post post = postRepository.findById(postId)
                .orElse(new Post());

        return commentRepository.findByPost(post);
    }
}
