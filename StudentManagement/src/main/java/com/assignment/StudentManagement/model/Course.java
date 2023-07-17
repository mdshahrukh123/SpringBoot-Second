package com.assignment.StudentManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;
    private String courseTitle;
    private String courseDescription;
    private Double courseDuration;
    @OneToMany
    @JoinColumn(name = "fk_course_Id")
    private List<Student> student;
}
