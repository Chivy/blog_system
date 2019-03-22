package com.mjelen.blog.entity;

import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private final String name;
}
