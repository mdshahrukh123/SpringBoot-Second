package com.test.EcommerceAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String name;
    @Email
    private String email;
    private String password;
    private String mobileNumber;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_User_Id")
//    private List<Address> address;
}
