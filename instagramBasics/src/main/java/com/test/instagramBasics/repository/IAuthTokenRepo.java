package com.test.instagramBasics.repository;

import com.test.instagramBasics.model.AuthenticationToken;
import com.test.instagramBasics.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Integer> {
    AuthenticationToken findFirstByTokenValue(String tokenValue);

    AuthenticationToken findFirstByUser(User user);
}
