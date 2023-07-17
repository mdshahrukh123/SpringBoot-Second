package com.assignment.StudentManagement.service;

import com.assignment.StudentManagement.model.Address;
import com.assignment.StudentManagement.model.Laptop;
import com.assignment.StudentManagement.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;

    public String createLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return " Added successfully....!!!!!!";
    }

    public List<Laptop> gateLaptops() {
        return laptopRepo.findAll();
    }

    public String removeLaptopById(Integer id) {
        laptopRepo.deleteById(id);
        return "Deleted Successfully.....!!!!!";
    }

    public String updatePriceById(Integer id, Double price) {
        Optional<Laptop> optionalLaptop = laptopRepo.findById(id);
        Laptop existLaptop = optionalLaptop.get();
        if(existLaptop == null){
            return "Laptop does not exist of Id :: "+id;
        }
        existLaptop.setLaptopPrice(price);
        laptopRepo.save(existLaptop);
        return "Updated successfully .....!!! with " + price+", and Id : "+id;
    }
}
