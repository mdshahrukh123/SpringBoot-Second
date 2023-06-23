package com.assignment.UserManagement.service;

import com.assignment.UserManagement.modal.User;
import com.assignment.UserManagement.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public List<User> showAllUsers() {
        return userRepo.getUsers();
    }

    public User findUserById(Integer id) {
        List<User> users = showAllUsers();
        User ans = null ;
        for(User user : users){
            if(user.getId() == id){
                 ans =  user;
                 break;
            }
        }
        return ans;
    }

    public String addUsers(List<User> user) {
        List<User> users = showAllUsers();
        users.addAll(user);
        return "Users added Successfull ....!!!!!";
    }

    public String removeUserBasedOnId(Integer id) {
        List<User> users = showAllUsers();
        for(User user : users){

            if(user.getId() == id){
                users.remove(user);
                return id + "  id user deleted Successfull.....!!!!";
            }
        }
        return id + "  id does not exist ...!!!!!!";
    }

    public String updateUserById(Integer id, String email) {
        List<User> users = showAllUsers();
        for(User user : users){
            if(user.getId() == id){
                user.setEmail(email);
                return "id - " +id + "Updated Successfully ... New Email Id is  "+ email ;
            }
        }
        return id +"  id does not exist ...!!!!";
    }
}
