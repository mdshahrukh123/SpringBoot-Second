package com.test.instagramBasics.service;

import com.test.instagramBasics.model.AuthenticationToken;
import com.test.instagramBasics.model.User;
import com.test.instagramBasics.repository.IAuthTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthTokenService {
    @Autowired
    IAuthTokenRepo authTokenRepo;
    public String  saveAuthToken(AuthenticationToken authToken) {
        authTokenRepo.save(authToken);
        return "Authentication Token Saved Successfully....!!!!";
    }

    public boolean authenticate(String email, String tokenValue) {
        AuthenticationToken authToken = authTokenRepo.findFirstByTokenValue(tokenValue);
        if(authToken == null){
            return false;
        }
        String tokenConnectedEmail = authToken.getUser().getUserEmail();
        return tokenConnectedEmail.equals(email);
    }

    public AuthenticationToken findFirstByUser(User user) {
        return authTokenRepo.findFirstByUser(user);
    }

    public void removeToken(AuthenticationToken token) {
        authTokenRepo.delete(token);
    }
}
