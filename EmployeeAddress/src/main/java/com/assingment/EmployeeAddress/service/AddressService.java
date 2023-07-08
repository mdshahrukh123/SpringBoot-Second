package com.assingment.EmployeeAddress.service;

import com.assingment.EmployeeAddress.model.Address;
import com.assingment.EmployeeAddress.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public Iterable<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepo.findById(id);
    }

    public String postAddress(Address address) {
         addressRepo.save(address);
         return "Added Successfully...";
    }

    public String removeAddressById(Long id) {
        addressRepo.deleteById(id);
        return "Deleted Successfully ...!!!!!";
    }

    public String updateAddressById(Long id, String street, String city) {
        Optional<Address> optAddress = addressRepo.findById(id);
        Address address = optAddress.get();
        if(address != null){
            address.setStreet(street);
            address.setCity(city);
            addressRepo.save(address);
        }else{
            return "Id doesn't exist....!!!!!";
        }
        return "Updated Successfully....!!!!!!";
    }
}
