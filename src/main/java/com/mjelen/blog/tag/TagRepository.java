package com.mjelen.blog.tag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

    Set<Tag> findAll();

    Optional<Tag> findByName(String name);

    void deleteByName(String name);
}
