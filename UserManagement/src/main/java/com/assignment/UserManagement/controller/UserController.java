package com.assignment.UserManagement.controller;

import com.assignment.UserManagement.modal.User;
import com.assignment.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //Get All Users
    @GetMapping("users")
    public List<User> getAllUsers(){
       return userService.showAllUsers();
    }
    //Get User by id ::::
    @GetMapping("user/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }

    // Post User
    @PostMapping("users")
    public String addUsersList(@RequestBody List<User> user){
        return userService.addUsers(user);
    }

    //Delete or Remove
    @DeleteMapping("user/{id}")
    public String removeUserById(@PathVariable Integer id){
      return userService.removeUserBasedOnId(id);
    }

    // put or update
    @PutMapping("user/{id}/{email}")
    public String updateUserEmailById(@PathVariable Integer id, @PathVariable String email){
       return userService.updateUserById(id,email);
    }
}
