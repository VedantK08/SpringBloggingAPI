package com.blog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class UpdateCommentRequest {
    private String title;
    private String description;
    private String blogId;
    private String userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
