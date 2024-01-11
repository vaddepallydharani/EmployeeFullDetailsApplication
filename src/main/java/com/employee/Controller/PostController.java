package com.employee.Controller;

import com.employee.model.posts.Posts;
import com.employee.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostsService postsService;

    @GetMapping("/all")
    public ResponseEntity<List> getPosts(){
        return postsService.getPosts();
    }

    @GetMapping("/post-by-id")
    public Posts getPostById(@RequestParam int id){
        return postsService.getPostById(id);
    }

    @PostMapping("/insert-post")
    public Posts createNewPost(@RequestBody Posts post){
        return postsService.createNewPost(post);
    }

    @DeleteMapping("/delete-post")
    public String deletePost(@RequestParam int postId){
        return postsService.deletePost(postId);

    }
}
