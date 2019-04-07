package com.mjelen.blog.tag;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mjelen.blog.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@JsonIgnoreProperties({"posts"})
public class Tag {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "tags", cascade = CascadeType.ALL)
    private List<Post> posts;

    public Tag(String name) {
        this.name = name;
    }
}
