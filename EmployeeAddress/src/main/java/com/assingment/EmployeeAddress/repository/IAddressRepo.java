package com.assingment.EmployeeAddress.repository;

import com.assingment.EmployeeAddress.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {
}
