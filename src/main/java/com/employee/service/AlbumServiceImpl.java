package com.employee.service;

import com.employee.model.albums.Albums;
import com.employee.model.comments.Comment;
import com.employee.model.todos.TodosResponse;
import com.employee.model.user.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AlbumServiceImpl implements AlbumService{
    @Override
    public List<Albums> getAllAlbums() {
        String uri = "https://jsonplaceholder.typicode.com/albums";
        final RestTemplate restTemplate = new RestTemplate();


       /* HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<Albums> request = new HttpEntity<>(null,headers);*/

        final ResponseEntity<List<Albums>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Albums>>(){});
        List<Albums> list = response.getBody();

        return list;
    }

    @Override
    public Albums get1Album(Integer id) {
        String uri = "https://jsonplaceholder.typicode.com/albums/" + id;
        RestTemplate restTemplate = new RestTemplate();

        Albums albums = restTemplate.getForObject(uri, Albums.class);


        List<Comment> comments = getAllCommentsByPostId(id);

        return albums;
    }

    @Override
    public List<Comment> getAllCommentsByPostId(Integer pId) {

        String url = "https://jsonplaceholder.typicode.com/comments";
        final RestTemplate restTemplate = new RestTemplate();

        UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("postId","{id}").build();

        Map<String, Integer> params = new HashMap<>();
        params.put("id", pId);

        final ResponseEntity<List<Comment>> response = restTemplate.exchange(
                builder.toString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Comment>>(){},
                params);
        List<Comment> list = response.getBody();

        return list;
    }
}
