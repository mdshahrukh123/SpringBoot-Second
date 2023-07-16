package com.test.instagramBasics.repository;

import com.test.instagramBasics.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {


    User findFirstByUserEmail(String newEmail);
}
