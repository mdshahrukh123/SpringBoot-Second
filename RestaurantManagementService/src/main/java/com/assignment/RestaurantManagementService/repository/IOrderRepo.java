package com.assignment.RestaurantManagementService.repository;

import com.assignment.RestaurantManagementService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Long> {
}
