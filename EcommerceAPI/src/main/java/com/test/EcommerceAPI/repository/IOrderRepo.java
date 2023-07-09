package com.test.EcommerceAPI.repository;

import com.test.EcommerceAPI.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Integer> {
}
