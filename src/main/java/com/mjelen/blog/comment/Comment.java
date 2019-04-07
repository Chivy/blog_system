package com.mjelen.blog.comment;

import com.mjelen.blog.account.user.User;
import com.mjelen.blog.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @Setter
    @Lob
    private String content;

    @CreationTimestamp
    private LocalDateTime creationDate;

    @Setter
    @UpdateTimestamp
    private LocalDateTime lastUpdateDate;

    @Setter
    @ManyToOne
    private User user;

    @Setter
    @ManyToOne
    private Post post;

    public Comment(String content, LocalDateTime lastUpdatedDate) {
        this.content = content;
        this.creationDate = LocalDateTime.now();
        this.lastUpdateDate = lastUpdatedDate;
    }
}

//TODO - history of edits (02.04.19)
