package com.assignment.RestaurantManagementService.repository;

import com.assignment.RestaurantManagementService.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin,Integer> {
}
