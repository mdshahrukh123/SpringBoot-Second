package com.weeklyTest.RestaurantManagementApi.repository;

import com.weeklyTest.RestaurantManagementApi.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {
    @Autowired
    List<Restaurant> restaurantList;

    public List<Restaurant> getListOfRestaurant() {
        return restaurantList;
    }
}
