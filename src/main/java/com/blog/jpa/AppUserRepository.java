package com.blog.jpa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.blog.model.User;

@Repository
public interface AppUserRepository extends MongoRepository<User,String> {
    User findByUsernameAndPassword(String userName, String password);

    User findByUsername(String username);

    User findByUserIdAndOtp(String userId,Integer otp);
}
