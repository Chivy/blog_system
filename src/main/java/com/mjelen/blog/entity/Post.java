package com.mjelen.blog.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @NotNull
    private String content;

    @CreationTimestamp
    private LocalDateTime creationDate;

    @UpdateTimestamp
    private LocalDateTime lastUpdateTime;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private List<Comment> comments = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "POST_TAGS",
            joinColumns = @JoinColumn(name = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id"))
    private List<Tag> tags = new ArrayList<>();

    public Post(String content) {
        this.content = content;
        this.creationDate = LocalDateTime.now();
        this.lastUpdateTime = LocalDateTime.now();
    }

    public void addComment(Comment comment) {
        if (comments == null) {
            comments = new ArrayList<>();
        }

        comments.add(comment);
    }

    public void deleteComment(Comment comment) {
        comments.remove(comment);
    }
}
