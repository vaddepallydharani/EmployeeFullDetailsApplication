package com.employee.Controller;

import com.employee.model.Order;
import com.employee.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    OrderService orderService;

    @PostMapping("/save")
    public Order saveEmployee(@RequestBody Order order) {

        return orderService.saveOrder(order);
    }

    @GetMapping("/fetch-all")
    public List<Order> getAllOrders() {

        return orderService.getAllOrders();
    }

}
