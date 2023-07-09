package com.test.EcommerceAPI.Service;

import com.test.EcommerceAPI.model.Order;
import com.test.EcommerceAPI.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    public String addOrder(Order order) {
        return "Added Successfully...."+orderRepo.save(order);
    }

    public Optional<Order> getOrderById(Integer id) {
        return orderRepo.findById(id);
    }
}
