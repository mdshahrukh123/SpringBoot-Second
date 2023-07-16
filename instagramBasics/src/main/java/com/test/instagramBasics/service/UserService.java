package com.test.instagramBasics.service;

import com.test.instagramBasics.model.AuthenticationToken;
import com.test.instagramBasics.model.Post;
import com.test.instagramBasics.model.User;
import com.test.instagramBasics.model.dto.SignInInput;
import com.test.instagramBasics.model.dto.SignUpOutPut;
import com.test.instagramBasics.repository.IUserRepo;
import com.test.instagramBasics.service.hashPassword.PasswordEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
    @Autowired
    AuthTokenService authTokenService;
    @Autowired
    PostService postService;

    // Sign Up
    public SignUpOutPut userCreateSignUp(User user) {

        Boolean signUpStatus = true;
        String signUpMessage = null;
        // check email not null
        String newEmail = user.getUserEmail();
        if(newEmail == null){
            signUpStatus = false;
            signUpMessage =  "Invalid user...!!!!";
            return new SignUpOutPut(signUpStatus,signUpMessage);
        }

        // check if user already exist
        User existUser = userRepo.findFirstByUserEmail(newEmail);
        if(existUser != null){
            signUpStatus = false;
            signUpMessage =  "User Email Already exist...!!!!";
            return new SignUpOutPut(signUpStatus,signUpMessage);
        }

        // encrypt password
        try{
           String encryptPass =  PasswordEncrypter.encryptPassword(user.getUserPassword());
           user.setUserPassword(encryptPass);
           userRepo.save(user);
            signUpMessage =  "User Registered Successfully (Signed Up)...!!!!";
            return new SignUpOutPut(signUpStatus,signUpMessage);
        }catch(Exception e){
            signUpStatus = false;
            signUpMessage =  "Internal Error occurred...!!!!";
            return new SignUpOutPut(signUpStatus,signUpMessage);
        }

    }

    public String userSignInByEmailAndPassword(SignInInput signInInput) {
        String signInMessage = null;

        // check email if email is null
        String newEmail = signInInput.getEmail();
        if(newEmail==null){
            signInMessage = "Invalid email...!!!!";
            return signInMessage;
        }
          // check email is exist or not

        User existUser = userRepo.findFirstByUserEmail(signInInput.getEmail());
        if(existUser == null){
            signInMessage = "email dose not exist...!!!";
            return signInMessage;
        }
        try {
            String encryptPassword = PasswordEncrypter.encryptPassword(signInInput.getPassword());

            if(encryptPassword.equals(existUser.getUserPassword())){
                AuthenticationToken authToken = new AuthenticationToken(existUser);
                String statusToken = authTokenService.saveAuthToken(authToken);
                signInMessage = statusToken + " Your Token is.."+authToken.getTokenValue();
                return signInMessage;
            }else{
                signInMessage = "Email or Password does not match.....!!!!!";
                return signInMessage;
            }
        } catch (NoSuchAlgorithmException e) {
            signInMessage = "Internal Error occurred.....!!!!!";
            return signInMessage;
        }
    }

    public String signOutUser(String email) {
        User user = userRepo.findFirstByUserEmail(email);
        AuthenticationToken token = authTokenService.findFirstByUser(user);
        authTokenService.removeToken(token);
        return "User Signed out successfully...";
    }

    public String createInstaPost(Post post, String email) {
        User postOwner = userRepo.findFirstByUserEmail(email);
        post.setUser(postOwner);
        return postService.createPost(post);

    }
}
