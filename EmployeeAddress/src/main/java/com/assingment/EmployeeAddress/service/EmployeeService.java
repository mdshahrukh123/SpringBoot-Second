package com.assingment.EmployeeAddress.service;

import com.assingment.EmployeeAddress.model.Employee;
import com.assingment.EmployeeAddress.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public String addEmployee(Employee employee) {
        return "Added Successfully....."  + employeeRepo.save(employee);
    }

    public Iterable<Employee> getAllEmp() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }

    public String deleteEmployeeById(Long id) {
         employeeRepo.deleteById(id);
         return "Delete Successfully....!!!!!";
    }

    public String updateEmployeeOrAddressById(Long id, String lastName, String street) {
        Optional<Employee> employeeOptional = employeeRepo.findById(id);
        System.out.println(employeeOptional);

        Employee employee = employeeOptional.get();
        System.out.println(employee);

        if(employee != null){
         employee.setLastName(lastName);
         employee.getAddress().setStreet(street);

         employeeRepo.save(employee);
        }else {
            return "Id doesn't exit...!!!!!";
        }
        return "Employee Has Been Updated By id : "+id+", Last Name : "+lastName+", Street : "+street;
    }
}
