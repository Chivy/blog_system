package com.mjelen.blog.tag;

import com.mjelen.blog.post.Post;
import com.mjelen.blog.post.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;
    private final PostRepository postRepository;

    @Override
    public Set<Tag> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public Optional<Tag> findByName(String name) {
        return tagRepository.findByName(name);
    }

    @Override
    public Tag save(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public void deleteByName(String name) {
        tagRepository.deleteByName(name);
    }

    @Override
    public Optional<Tag> findById(Long id) {
        return tagRepository.findById(id);
    }

    @Override
    public Tag update(Tag tag) {
        Tag oldTag = tagRepository.findById(tag.getId())
                .orElseGet(() -> new Tag(""));

        for (Post post : postRepository.findByTags(tag)) {
            post.deleteTag(oldTag);
            post.addTag(tag);
            postRepository.save(post);
        }
        tagRepository.save(tag);
        return tag;
    }
}
