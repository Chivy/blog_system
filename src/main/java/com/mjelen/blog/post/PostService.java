package com.mjelen.blog.post;

import com.mjelen.blog.account.user.User;
import com.mjelen.blog.tag.Tag;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;
import java.util.Optional;

public interface PostService {

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_AUTHOR', 'ROLE_USER')")
    List<Post> findAll();

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_AUTHOR', 'ROLE_USER')")
    Optional<Post> findById(Long id);

    List<Post> findThreeLastPosts();

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_AUTHOR')")
    Post save(Post post, User user);

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_AUTHOR') and #post.user.equals(principal)")
    void delete(Post post);

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_AUTHOR', 'ROLE_USER')")
    List<Post> findByTagName(Tag tag);


    Post addTags(Post post, String[] names);
}
