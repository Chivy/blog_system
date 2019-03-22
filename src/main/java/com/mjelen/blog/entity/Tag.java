package com.mjelen.blog.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
public class Tag {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Post post;
    
    public Tag(String name) {
        this.name = name;
    }


}
