package com.mjelen.blog.post;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mjelen.blog.account.user.User;
import com.mjelen.blog.comment.Comment;
import com.mjelen.blog.tag.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@NoArgsConstructor
@Getter
@JsonIgnoreProperties({"id", "comments"})
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

    void addTags(Set<Tag> tags) {
        if (this.tags == null) {
            this.tags = new HashSet<>();
        }
        this.tags.addAll(tags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) &&
                Objects.equals(title, post.title) &&
                Objects.equals(content, post.content) &&
                Objects.equals(creationDate, post.creationDate) &&
                Objects.equals(lastUpdateTime, post.lastUpdateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, creationDate, lastUpdateTime);
    }
}
