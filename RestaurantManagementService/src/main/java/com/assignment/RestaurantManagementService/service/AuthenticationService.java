package com.assignment.RestaurantManagementService.service;

import com.assignment.RestaurantManagementService.model.AuthenticationToken;
import com.assignment.RestaurantManagementService.repository.IAuthTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthenticationService {
    @Autowired
    IAuthTokenRepo authTokenRepo;

    public boolean authenticate(String email, String authTokenValue)
    {
        AuthenticationToken authToken = authTokenRepo.findFirstByTokenValue(authTokenValue);

        if(authToken == null)
        {
            return false;
        }

        String tokenConnectedEmail = authToken.getUser().getUserEmail();

        return tokenConnectedEmail.equals(email);
    }
}
