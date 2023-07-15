package com.assignment.RestaurantManagementService.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=User.class,property="userId")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    @Email
    private String userEmail;
    private String userPassword;
    private String userMobile;
    private String userAddress;
    private Integer userAge;

}
