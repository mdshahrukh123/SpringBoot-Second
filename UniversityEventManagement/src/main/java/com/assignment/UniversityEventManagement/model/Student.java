package com.assignment.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private Integer id;
    @Pattern(regexp = "[A-Z][a-zA-Z]*")
    private String firstName;
    private String lastName;
    @Min(18)
    @Max(25)
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
