package com.mjelen.blog.post;

import com.mjelen.blog.tag.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    Optional<Post> findById(Long id);

    List<Post> findAll();

    List<Post> findFirst3ByCreationDate(LocalDateTime dateTime);

    void deleteById(Long id);

    List<Post> findByTags(Tag tag);
}
