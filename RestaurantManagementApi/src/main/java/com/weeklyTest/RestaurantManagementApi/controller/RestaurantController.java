package com.weeklyTest.RestaurantManagementApi.controller;

import com.weeklyTest.RestaurantManagementApi.model.Restaurant;
import com.weeklyTest.RestaurantManagementApi.model.Speciality;
import com.weeklyTest.RestaurantManagementApi.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    // Get All restaurant

    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getRestaurant();
    }
    // get Restaurant By Id
    @GetMapping("restaurant")
    public Restaurant getRestaurantById(@RequestParam Integer id){
        return restaurantService.getRestaurantById(id);
    }

    // Post and Add List Of Restaurant

    @PostMapping("restaurants")
    public String addRestaurant(@RequestBody @Valid List<Restaurant> restaurant){
        return restaurantService.saveRestaurants(restaurant);
    }

    // Delete restaurant from list by id
    @DeleteMapping("restaurant/{id}")
    public String removeRestaurant(@PathVariable Integer id){
        return restaurantService.deleteRestaurant(id);
    }

    // put or update speciality of restaurant by id
    @PutMapping("restaurant")
    public String updateSpecialityOfRestaurantById(@RequestParam Integer id, @RequestParam Speciality speciality){
        return restaurantService.updateRestaurantById(id,speciality);
    }
}
