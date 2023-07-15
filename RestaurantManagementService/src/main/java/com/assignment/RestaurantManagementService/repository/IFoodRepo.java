package com.assignment.RestaurantManagementService.repository;

import com.assignment.RestaurantManagementService.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodRepo extends JpaRepository<FoodItem,Integer> {
}
