package com.mjelen.blog.tag;

import com.mjelen.blog.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Tag {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
    private List<Post> post;

    public Tag(String name) {
        this.name = name;
    }
}
