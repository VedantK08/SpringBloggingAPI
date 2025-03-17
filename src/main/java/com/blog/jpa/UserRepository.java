package com.blog.jpa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.blog.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findByUsernameAndPassword(String username, String password);
}
