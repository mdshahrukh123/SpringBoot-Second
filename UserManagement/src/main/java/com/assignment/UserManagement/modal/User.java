package com.assignment.UserManagement.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String mobile;
    private String email;
    private Gender gender;
    private Type userType;
}
