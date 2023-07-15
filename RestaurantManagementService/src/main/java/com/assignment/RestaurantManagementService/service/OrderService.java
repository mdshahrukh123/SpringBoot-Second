package com.assignment.RestaurantManagementService.service;

import com.assignment.RestaurantManagementService.model.Order;
import com.assignment.RestaurantManagementService.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    public  String placeOrder(Order order) {
        orderRepo.save(order);
        return "Order Placed Successfully....!!!!!";
    }

    public String addOrder(Order order) {
        orderRepo.save(order);
        return "Added SuccessFully....!!!!!!";
    }


}
