package com.mjelen.blog.post;

import com.mjelen.blog.account.user.User;
import com.mjelen.blog.tag.Tag;
import com.mjelen.blog.tag.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;
    private final TagService tagService;

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
    public void delete(Post post) {
        User user = post.getUser();
        user.deletePost(post);

        postRepository.deleteById(post.getId());
    }

    @Override
    public List<Post> findByTagName(Tag tag) {
        return postRepository.findByTags(tag);
    }

    @Override
    @Transactional
    public Post addTags(Post post, String[] names) {
        Set<Tag> tagsToAdd = Arrays.stream(names)
                .distinct()
                .map(name -> tagService.findByName(name).orElse(new Tag()))
                .filter(tag -> tag.getId() != 0)
                .collect(Collectors.toSet());

        tagsToAdd.forEach(tag -> tag.addPost(post));
        post.addTags(tagsToAdd);

        return post;
    }
}
