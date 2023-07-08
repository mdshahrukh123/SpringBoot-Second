package com.assingment.EmployeeAddress.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    private Long addId;
    private String street;
    private String city;
    private String state;
    private String zipCode;
}
