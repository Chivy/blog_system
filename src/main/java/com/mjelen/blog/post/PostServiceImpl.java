package com.mjelen.blog.post;

import com.mjelen.blog.account.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> findThreeLastPosts() {
        return postRepository.findFirst3ByCreationDate(LocalDateTime.now());
    }

    @Override
    @Transactional
    public Post save(Post post, User user) {
        post.setUser(user);
        user.addPost(post);

        return postRepository.save(post);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Post post = postRepository.findById(id)
                .orElse(new Post());

        User user = post.getUser();
        user.deletePost(post);

        postRepository.deleteById(id);
    }
}
