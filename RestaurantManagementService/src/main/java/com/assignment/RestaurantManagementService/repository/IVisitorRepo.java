package com.assignment.RestaurantManagementService.repository;

import com.assignment.RestaurantManagementService.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVisitorRepo extends JpaRepository<Visitor,Integer> {
}
