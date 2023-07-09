package com.test.EcommerceAPI.repository;

import com.test.EcommerceAPI.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
