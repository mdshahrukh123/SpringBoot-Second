package com.test.EcommerceAPI.repository;

import com.test.EcommerceAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {
}
