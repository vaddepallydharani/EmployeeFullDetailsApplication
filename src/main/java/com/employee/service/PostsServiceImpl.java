package com.employee.service;

import com.employee.model.posts.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class PostsServiceImpl implements PostsService{
    @Autowired
    RestTemplate restTemplate;

    String url="https://jsonplaceholder.typicode.com/posts/";


    @Override
    public ResponseEntity<List> getPosts() {

                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
              HttpEntity httpEntity=new HttpEntity<>(httpHeaders);
       ResponseEntity<List> posts= restTemplate.exchange(url, HttpMethod.GET,httpEntity,List.class);

        return posts;
    }

    @Override
    public Posts getPostById(int id) {
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType( MediaType.APPLICATION_JSON);
        HttpEntity httpEntity= new HttpEntity(httpHeaders);
        String uri=url.concat(String.valueOf(id));

       ResponseEntity<Posts> post= restTemplate.exchange(uri,HttpMethod.GET,httpEntity,Posts.class);
        return post.getBody();
    }

    public Posts createNewPost(Posts post){
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType( MediaType.APPLICATION_JSON);
        HttpEntity<Posts> httpEntity= new HttpEntity<>(post,httpHeaders);
        ResponseEntity<Posts> postResult= restTemplate.exchange(url,HttpMethod.POST,httpEntity,Posts.class);
        return postResult.getBody();
    }

    @Override
    public String deletePost(@RequestParam int id) {
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType( MediaType.APPLICATION_JSON);
        HttpEntity httpEntity= new HttpEntity<>(httpHeaders);
        String uri=url.concat(String.valueOf(id));
        ResponseEntity<Posts> response= restTemplate.exchange(uri,HttpMethod.DELETE,httpEntity,Posts.class);
        if(!response.getStatusCode().is2xxSuccessful()){
            return "Failed to Delete";
        }
        return "Deleted Successfully";

    }


}
