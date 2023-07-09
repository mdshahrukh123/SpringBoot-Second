package com.test.EcommerceAPI.controller;

import com.test.EcommerceAPI.Service.OrderService;
import com.test.EcommerceAPI.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String createOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @GetMapping("order/id/{id}")
    public Optional<Order> getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }
}
