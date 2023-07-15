package com.assignment.RestaurantManagementService.service;

import com.assignment.RestaurantManagementService.model.Admin;
import com.assignment.RestaurantManagementService.repository.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    IAdminRepo adminRepo;

    public String createAdmin(Admin admin) {
        adminRepo.save(admin);
        return "Added Successfully......!!!!!!!";
    }
}
