package com.assignment.StudentManagement.controller;

import com.assignment.StudentManagement.model.Address;
import com.assignment.StudentManagement.model.Student;
import com.assignment.StudentManagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    /// post address
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }

    // Get All addresses
    @GetMapping("addresses")
    public List<Address> getAllAddress(){
        return addressService.gatAddresses();
    }

    // Delete address
    @DeleteMapping("address/id/{id}")
    public String deleteAddress(@PathVariable Integer id){
        return addressService.removeAddressById(id);
    }

    // Update address Landmark by id
    @PutMapping("address/id/{id}/landmark/{landmark}")
    public String updateAddressLandmark(@PathVariable Integer id, @PathVariable String landmark){
        return addressService.updateLandmarkById(id,landmark);
    }
}
