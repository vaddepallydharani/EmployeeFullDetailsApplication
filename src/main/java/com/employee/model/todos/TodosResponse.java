package com.employee.model.todos;

import lombok.Data;

@Data
public class TodosResponse {
    private  int userId;
    private  int id;
    private  String title;
    private Boolean completed;

}
