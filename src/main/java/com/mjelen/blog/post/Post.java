package com.mjelen.blog.post;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mjelen.blog.account.user.User;
import com.mjelen.blog.comment.Comment;
import com.mjelen.blog.tag.Tag;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@JsonIgnoreProperties({"comments"})
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    @Lob
    private String content;

    @CreationTimestamp
    @Column(insertable = false, updatable = false)
    private LocalDateTime creationDate;

    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDateTime lastUpdateTime;

    @ManyToOne
    @Setter
    private User user;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private List<Comment> comments = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name="post_tags",
            joinColumns = @JoinColumn(name = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id"))
    private Set<Tag> tags = new HashSet<>();

    public Post(String title, String content) {
        this.title = title;
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

    public void deleteTag(Tag tag) {
        tags.remove(tag);
    }

    public void addTag(Tag tag) {
        tags.add(tag);
    }
}
