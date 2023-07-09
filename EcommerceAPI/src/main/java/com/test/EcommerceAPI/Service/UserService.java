package com.test.EcommerceAPI.Service;

import com.test.EcommerceAPI.model.User;
import com.test.EcommerceAPI.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
   @Autowired
    IUserRepo userRepo;

    public String AddUser(User user) {
        return "Added Successfully...."+userRepo.save(user);
    }

    public Optional<User> getUserById(Integer id) {
        return userRepo.findById(id);
    }
}
