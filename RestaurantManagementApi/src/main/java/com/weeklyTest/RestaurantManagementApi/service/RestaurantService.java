package com.weeklyTest.RestaurantManagementApi.service;

import com.weeklyTest.RestaurantManagementApi.model.Restaurant;
import com.weeklyTest.RestaurantManagementApi.model.Speciality;
import com.weeklyTest.RestaurantManagementApi.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;


    public List<Restaurant> getRestaurant() {
      return restaurantRepo.getListOfRestaurant();
    }

    public Restaurant getRestaurantById(Integer id) {
        List<Restaurant> listRestaurant = getRestaurant();
        Restaurant ans  = null;
        for(Restaurant restaurant : listRestaurant){
            if(restaurant.getRestaurantId() == id){
                ans = restaurant;
                break;
            }
        }
        return ans;
    }

    public String saveRestaurants(List<Restaurant> restaurant) {
        List<Restaurant> listRestaurant = getRestaurant();

        listRestaurant.addAll(restaurant);
        return "Restaurants Added Successfully...!!!!!1";
    }

    public String deleteRestaurant(Integer id) {
        List<Restaurant> listRestaurant = getRestaurant();

        for(Restaurant restaurant : listRestaurant){
            if(restaurant.getRestaurantId() == id){
                listRestaurant.remove(restaurant);
                return id + " Id or restaurant Removed successfully....!!!! ";
            }
        }
        return id+ " Id does not exist....!!!";
    }

    public String updateRestaurantById(Integer id, Speciality speciality) {
        List<Restaurant> listRestaurant = getRestaurant();

        for(Restaurant restaurant : listRestaurant){
            if(restaurant.getRestaurantId() == id){
                restaurant.setSpeciality(speciality);

                return id + " Id Speciality restaurant Updated successfully....!!!! ";
            }
        }
        return id+ " Id does not exist....!!!";
    }
}



