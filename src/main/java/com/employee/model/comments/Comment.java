package com.employee.model.comments;

import lombok.Data;

@Data
public class Comment {

    private long postID;
    private long id;
    private String name;
    private String email;
    private String body;
}
