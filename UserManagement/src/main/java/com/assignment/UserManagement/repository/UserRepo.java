package com.assignment.UserManagement.repository;


import com.assignment.UserManagement.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepo {
    @Autowired
    List<User> listUser;

    public List<User> getUsers() {
        return listUser;
    }
}
