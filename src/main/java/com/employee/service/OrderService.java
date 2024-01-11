package com.employee.service;

import com.employee.model.Order;

import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);

    List<Order> getAllOrders();
}
