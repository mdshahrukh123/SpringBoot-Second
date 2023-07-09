package com.test.EcommerceAPI.Service;

import com.test.EcommerceAPI.model.Address;
import com.test.EcommerceAPI.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        return "Added Successfully....."+ addressRepo.save(address);
    }
}
