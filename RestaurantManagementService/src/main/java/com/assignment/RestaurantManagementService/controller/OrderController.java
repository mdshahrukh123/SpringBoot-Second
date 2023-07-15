package com.assignment.RestaurantManagementService.controller;

import com.assignment.RestaurantManagementService.model.Order;
import com.assignment.RestaurantManagementService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String createOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }
}
