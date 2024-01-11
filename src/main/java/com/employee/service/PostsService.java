package com.employee.service;

import com.employee.model.posts.Posts;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PostsService {
    public ResponseEntity<List> getPosts();

    public Posts getPostById(int id);
    public Posts createNewPost(Posts post);

    public String deletePost( int id);

}
