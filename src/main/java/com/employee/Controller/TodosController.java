package com.employee.Controller;

import com.employee.model.todos.TodosResponse;
import com.employee.service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodosController {
    @Autowired
    TodosService todosService;

    @GetMapping("/all")
    public List<TodosResponse> getTodos(){
        return todosService.getTodos();
    }

}
