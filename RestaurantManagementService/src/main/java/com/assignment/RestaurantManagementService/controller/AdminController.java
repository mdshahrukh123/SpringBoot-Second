package com.assignment.RestaurantManagementService.controller;

import com.assignment.RestaurantManagementService.model.Admin;
import com.assignment.RestaurantManagementService.model.FoodItem;
import com.assignment.RestaurantManagementService.model.User;
import com.assignment.RestaurantManagementService.model.Visitor;
import com.assignment.RestaurantManagementService.service.AdminService;
import com.assignment.RestaurantManagementService.service.FoodService;
import com.assignment.RestaurantManagementService.service.UserService;
import com.assignment.RestaurantManagementService.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
     @Autowired
    UserService userService;
     @Autowired
     VisitorService visitorService;
     @Autowired
     FoodService foodService;
     // Adding Admin
    @PostMapping("admin")
    public String addAdmin(@RequestBody Admin admin){
        return adminService.createAdmin(admin);
    }
    // Add foodItem By Admin

    @PostMapping("food")
    public String addFoodItem( @RequestBody FoodItem foodItem){
        return foodService.addFood(foodItem);
    }
    // View  All Food by Admin
    @GetMapping("food")
    public Iterable<FoodItem> getAllFood(){
        return foodService.getFood();
    }

    // View  All User by Admin
    @GetMapping("users")
    public Iterable<User> getAllUser(){
        return userService.getUserThroughAdmin();
    }
    // View  All Visitor by Admin
    @GetMapping("visitors")
    public Iterable<Visitor> getAllVisitor(){
        return visitorService.getVisitorThroughAdmin();
    }

}
