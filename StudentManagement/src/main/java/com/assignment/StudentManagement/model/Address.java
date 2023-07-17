package com.assignment.StudentManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String landmark;
    private String district;
    private String state;
    private String country;
    private String zipcode;
    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;
}
