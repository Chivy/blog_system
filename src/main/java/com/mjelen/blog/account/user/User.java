package com.mjelen.blog.account.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mjelen.blog.account.role.Role;
import com.mjelen.blog.comment.Comment;
import com.mjelen.blog.post.Post;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@JsonIgnoreProperties({"posts", "roles", "comments"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;

    @Column(unique = true)
    private String email;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;

    @OneToMany(mappedBy = "user")
    private List<Post> posts = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdDate = LocalDateTime.now();
        this.lastUpdatedDate = LocalDateTime.now();
    }
}
