package com.test.EcommerceAPI.controller;

import com.test.EcommerceAPI.Service.UserService;
import com.test.EcommerceAPI.model.Order;
import com.test.EcommerceAPI.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String createUser(@RequestBody User user){
        return userService.AddUser(user);
    }

    @GetMapping("user/id/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
