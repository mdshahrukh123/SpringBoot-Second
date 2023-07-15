package com.assignment.RestaurantManagementService.repository;

import com.assignment.RestaurantManagementService.model.AuthenticationToken;
import com.assignment.RestaurantManagementService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {

        AuthenticationToken findFirstByTokenValue(String authTokenValue);


        AuthenticationToken findFirstByUser(User user);
}
