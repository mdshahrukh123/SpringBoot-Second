package com.test.EcommerceAPI.controller;

import com.test.EcommerceAPI.Service.AddressService;
import com.test.EcommerceAPI.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String createAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
}
