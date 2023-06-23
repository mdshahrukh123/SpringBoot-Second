package com.assignment.UserManagement.configuration;

import com.assignment.UserManagement.modal.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.assignment.UserManagement.modal.Gender.MALE;
import static com.assignment.UserManagement.modal.Type.ADMIN;

@Configuration
public class BeanManagement {
    @Bean
    public List<User>  getArrayList(){
        User user = new User(0,"Srk Khan",23,"8787878787","srk@gmail.com",MALE,ADMIN);
       List<User> arrayList = new ArrayList<>();
       arrayList.add(user);
        return arrayList;
    }
}
