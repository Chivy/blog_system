package com.mjelen.blog.repository;

import com.mjelen.blog.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
