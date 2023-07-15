package com.assignment.RestaurantManagementService.service;

import com.assignment.RestaurantManagementService.model.FoodItem;
import com.assignment.RestaurantManagementService.model.User;
import com.assignment.RestaurantManagementService.repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    IFoodRepo foodRepo;

    public String addFood(FoodItem foodItem) {
        foodRepo.save(foodItem);
        return "Food Added By Admin....!!!!";
    }

    public Iterable<FoodItem> getFood() {
        return foodRepo.findAll();
    }


}
