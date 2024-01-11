package com.employee.service;

import com.employee.model.todos.TodosResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodosService {
    public List<TodosResponse> getTodos();
}
