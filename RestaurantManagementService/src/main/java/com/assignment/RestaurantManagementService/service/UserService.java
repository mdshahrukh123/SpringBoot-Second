package com.assignment.RestaurantManagementService.service;

import com.assignment.RestaurantManagementService.model.AuthenticationToken;
import com.assignment.RestaurantManagementService.model.User;
import com.assignment.RestaurantManagementService.model.dto.SignInInput;
import com.assignment.RestaurantManagementService.model.dto.SignUpOutput;
import com.assignment.RestaurantManagementService.repository.IAuthTokenRepo;
import com.assignment.RestaurantManagementService.repository.IUserRepo;
import com.assignment.RestaurantManagementService.service.utility.PasswordEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
   @Autowired
   IAuthTokenRepo authTokenRepo;

    public Iterable<User> getUserThroughAdmin() {
        return userRepo.findAll();
    }


    public SignUpOutput signUpUser(User user) {

            boolean signUpStatus = true;
            String signUpStatusMessage = null;

            String newEmail = user.getUserEmail();

            if(newEmail == null)
            {
                signUpStatusMessage = "Invalid email";
                signUpStatus = false;
                return new SignUpOutput(signUpStatus,signUpStatusMessage);
            }

            //check if this user email already exists ??
            User existingUser = userRepo.findFirstByUserEmail(newEmail);

            if(existingUser != null)
            {
                signUpStatusMessage = "Email already registered!!!";
                signUpStatus = false;
                return new SignUpOutput(signUpStatus,signUpStatusMessage);
            }

            //hash the password: encrypt the password
            try {
                String encryptedPassword = PasswordEncrypter.encryptPassword(user.getUserPassword());

                //saveAppointment the patient with the new encrypted password

                user.setUserPassword(encryptedPassword);
                userRepo.save(user);

                return new SignUpOutput(signUpStatus, "Patient registered successfully!!!");
            }
            catch(Exception e) {
                signUpStatusMessage = "Internal error occurred during sign up";
                signUpStatus = false;
                return new SignUpOutput(signUpStatus, signUpStatusMessage);
            }
    }

    public String signInUser(SignInInput signInInput) {

            String signInStatusMessage = null;

            String signInEmail = signInInput.getEmail();

            if(signInEmail == null)
            {
                signInStatusMessage = "Invalid email";
                return signInStatusMessage;

            }

            //check if this patient email already exists ??
            User existingUser = userRepo.findFirstByUserEmail(signInEmail);

            if(existingUser == null)
            {
                signInStatusMessage = "Email not registered!!!";
                return signInStatusMessage;

            }

            //match passwords :

            //hash the password: encrypt the password
            try {
                String encryptedPassword = PasswordEncrypter.encryptPassword(signInInput.getPassword());
                if(existingUser.getUserPassword().equals(encryptedPassword))
                {
                    //session should be created since password matched and user id is valid
                    AuthenticationToken authToken  = new AuthenticationToken(existingUser);
                    authTokenRepo.save(authToken);

//                    EmailHandler.sendEmail(signInEmail,"email testing",authToken.getTokenValue());
                    return "Token add to your database";
                }
                else {
                    signInStatusMessage = "Invalid credentials!!!";
                    return signInStatusMessage;
                }
            }
            catch(Exception e)
            {
                signInStatusMessage = "Internal error occurred during sign in";
                return signInStatusMessage;
            }

    }

    public String sigOutUser(String email) {
        User user = userRepo.findFirstByUserEmail(email);
        authTokenRepo.delete(authTokenRepo.findFirstByUser(user));
        return "Patient Signed out successfully";
    }
}
