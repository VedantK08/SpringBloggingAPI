package com.blog.jpa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.blog.model.Comment;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<Comment,String> {

    Comment deleteByCommentId(String commentId);

    List<Comment> findByBlogId(String blogId, Pageable pageable);

}
