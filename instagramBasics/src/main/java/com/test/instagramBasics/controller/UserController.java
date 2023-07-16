package com.test.instagramBasics.controller;

import com.test.instagramBasics.model.AuthenticationToken;
import com.test.instagramBasics.model.Post;
import com.test.instagramBasics.model.User;
import com.test.instagramBasics.model.dto.SignInInput;
import com.test.instagramBasics.model.dto.SignUpOutPut;
import com.test.instagramBasics.service.AuthTokenService;
import com.test.instagramBasics.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    AuthTokenService authTokenService;
    @PostMapping("user/signUp")
    public SignUpOutPut userSignUp(@RequestBody User user){
        return userService.userCreateSignUp(user);
    }

    @PostMapping("user/signIn")
    public String userSignIn(@RequestBody SignInInput signInInput){
        return userService.userSignInByEmailAndPassword(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String userSignOut(@RequestParam String email,@RequestParam String tokenValue){
        if(authTokenService.authenticate(email,tokenValue)){
            return userService.signOutUser(email);
        }else{
            return "Sign out not allowed for non authenticated user. ";
        }
    }
    @PostMapping("post/Upload")
    public String createPost(@RequestBody Post post, @RequestParam String email,@RequestParam String token){
        if(authTokenService.authenticate(email,token)){
            return userService.createInstaPost(post,email);
        }else{
            return " Not an authenticated user.... ";
        }
    }

}
