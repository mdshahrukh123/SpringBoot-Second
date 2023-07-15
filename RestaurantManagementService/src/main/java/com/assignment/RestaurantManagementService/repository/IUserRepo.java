package com.assignment.RestaurantManagementService.repository;

import com.assignment.RestaurantManagementService.model.User;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {

    User findFirstByUserEmail(String signInEmail);
}
