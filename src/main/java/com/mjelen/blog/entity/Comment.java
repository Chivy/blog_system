package com.mjelen.blog.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    @Setter
    private String content;

    @CreationTimestamp
    private LocalDateTime creationDate;

    @Setter
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;

    @Setter
    @ManyToOne
    private User user;

    @Setter
    @ManyToOne
    private Post post;

    public Comment(String content, LocalDateTime creationDate, LocalDateTime lastUpdatedDate) {
        this.content = content;
        this.creationDate = LocalDateTime.now();
        this.lastUpdatedDate = lastUpdatedDate;
    }
}

//TODO - history of edits (02.04.19)
