package com.assignment.RestaurantManagementService.controller;

import com.assignment.RestaurantManagementService.model.Order;
import com.assignment.RestaurantManagementService.model.User;
import com.assignment.RestaurantManagementService.model.dto.SignInInput;
import com.assignment.RestaurantManagementService.model.dto.SignUpOutput;
import com.assignment.RestaurantManagementService.service.AuthenticationService;
import com.assignment.RestaurantManagementService.service.OrderService;
import com.assignment.RestaurantManagementService.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    OrderService orderService;
    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("user/signup")
    public SignUpOutput signUpUser(@RequestBody User user)
    {
        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String sigInUser(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String sigOutUser(String email, String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.sigOutUser(email);
        }
        else {
            return "Sign out not allowed for non authenticated user.";
        }

    }


    // Order by User
    @PostMapping("order")
    public String createOrder(@RequestBody Order order){
        return orderService.placeOrder(order);
    }
}
