package com.assingment.EmployeeAddress.controller;

import com.assingment.EmployeeAddress.model.Address;
import com.assingment.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("addresses")
    public Iterable<Address> getAllAddress(){
       return  addressService.getAllAddress();
    }

    @GetMapping("address/id/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }
    @PostMapping("address")
    public String postAddress(@RequestBody Address address){
        return addressService.postAddress(address);
    }
    @DeleteMapping("address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.removeAddressById(id);
    }
    @PutMapping("address")
    public String updateAddressById(@RequestParam Long id,@RequestParam String street,@RequestParam String city){
        return addressService.updateAddressById(id,street,city);
    }
}
