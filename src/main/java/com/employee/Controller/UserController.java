package com.employee.Controller;


import com.employee.model.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class UserController {
 
 @GetMapping("/user/{id}")
 private User getUser(@PathVariable Integer id)   {
  String uri = "https://jsonplaceholder.typicode.com/users/" + id;
  RestTemplate restTemplate = new RestTemplate();
  
  User user = restTemplate.getForObject(uri, User.class);

  return user;
 }
 
}