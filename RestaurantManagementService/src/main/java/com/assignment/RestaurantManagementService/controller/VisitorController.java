package com.assignment.RestaurantManagementService.controller;

import com.assignment.RestaurantManagementService.model.FoodItem;
import com.assignment.RestaurantManagementService.model.Visitor;
import com.assignment.RestaurantManagementService.service.FoodService;
import com.assignment.RestaurantManagementService.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitorController {
    @Autowired
    VisitorService visitorService;
    @Autowired
    FoodService foodService;

    // Adding Visitor
    @PostMapping("visitor")
    public  String createVisitor(@RequestBody Visitor visitor){
        return visitorService.addVisitor(visitor);
    }

    // View food Item By Visitor

    @GetMapping("food")
    public Iterable<FoodItem> getAllFood(){
        return foodService.getFood();
    }


}
