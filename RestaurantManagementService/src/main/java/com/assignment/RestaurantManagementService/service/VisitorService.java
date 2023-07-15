package com.assignment.RestaurantManagementService.service;

import com.assignment.RestaurantManagementService.model.Visitor;
import com.assignment.RestaurantManagementService.repository.IVisitorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {
    @Autowired
    IVisitorRepo  visitorRepo;

    public String addVisitor(Visitor visitor) {
        visitorRepo.save(visitor);
        return "Added Successfully...!!!!!!!";
    }

    public Iterable<Visitor> getVisitorThroughAdmin() {

        return visitorRepo.findAll();
    }
}
