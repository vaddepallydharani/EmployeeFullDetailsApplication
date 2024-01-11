package com.employee.service;

import com.employee.model.todos.TodosResponse;
import com.employee.model.user.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TodosServiceImpl implements TodosService{
    @Override
    public List<TodosResponse> getTodos() {
        String uri = "https://jsonplaceholder.typicode.com/todos";
        final RestTemplate restTemplate = new RestTemplate();
        final ResponseEntity<List<TodosResponse>> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TodosResponse>>(){});
        List<TodosResponse> list = response.getBody();

        return list;
    }
}
