package com.assignment.StudentManagement.controller;

import com.assignment.StudentManagement.model.Laptop;
import com.assignment.StudentManagement.model.Student;
import com.assignment.StudentManagement.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    /// post laptop
    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.createLaptop(laptop);
    }

    // Get All laptops
    @GetMapping("laptops")
    public List<Laptop> getAllLaptop(){
        return laptopService.gateLaptops();
    }

    // Delete laptop
    @DeleteMapping("laptop/id/{id}")
    public String deleteLaptop(@PathVariable Integer id){
        return laptopService.removeLaptopById(id);
    }

    // Update Laptop price by id
    @PutMapping("laptop/id/{id}/price/{price}")
    public String updateLaptopPrice(@PathVariable Integer id, @PathVariable Double price){
        return laptopService.updatePriceById(id,price);
    }
}
