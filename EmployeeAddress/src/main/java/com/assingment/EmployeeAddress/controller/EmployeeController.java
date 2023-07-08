package com.assingment.EmployeeAddress.controller;

import com.assingment.EmployeeAddress.model.Employee;
import com.assingment.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee employee){
       return employeeService.addEmployee(employee);
    }

    @GetMapping("employees")
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAllEmp();
    }
    @GetMapping("employee/id/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("employee/id/{id}")
    public String removeEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }

    @PutMapping("employee/id/lastName/street")
    public String updateEmployeeLastNameAndAddressStreetById(@RequestParam Long id,@RequestParam String lastName,@RequestParam String street){
        return employeeService.updateEmployeeOrAddressById(id,lastName,street);

    }
}
