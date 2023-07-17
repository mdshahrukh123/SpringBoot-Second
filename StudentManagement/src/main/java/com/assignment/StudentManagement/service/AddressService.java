package com.assignment.StudentManagement.service;

import com.assignment.StudentManagement.model.Address;
import com.assignment.StudentManagement.model.Student;
import com.assignment.StudentManagement.repository.IAddressRepo;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String createAddress(Address address) {
        addressRepo.save(address);
        return "Address Added Successfully...!!!!!";
    }

    public List<Address> gatAddresses() {
        return addressRepo.findAll();
    }

    public String removeAddressById(Integer id) {
        addressRepo.deleteById(id);
        return "Deleted Successfully ......!!!!!";
    }

    public String updateLandmarkById(Integer id, String landmark) {
        Optional<Address> optionalAddress = addressRepo.findById(id);
        Address existAddress = optionalAddress.get();
        if(existAddress == null){
            return "Address does not exist of Id :: "+id;
        }
        existAddress.setLandmark(landmark);
        addressRepo.save(existAddress);
        return "Updated successfully .....!!! with " + landmark+", and Id : "+id;
    }
}
