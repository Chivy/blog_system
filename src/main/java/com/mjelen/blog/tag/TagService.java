package com.mjelen.blog.tag;

import java.util.Optional;
import java.util.Set;

public interface TagService {

    Set<Tag> findAll();

    Optional<Tag> findByName(String name);

    Tag save(Tag tag);

    void deleteByName(String name);
}
