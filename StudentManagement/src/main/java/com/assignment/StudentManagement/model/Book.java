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
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookTitle;
    private String bookDescription;
    private String bookAuthor;
    private Double bookPrice;
    @ManyToMany
    @JoinTable(name = "fk_table_Book_Student",joinColumns = @JoinColumn(name = "fk_Book_Id"),inverseJoinColumns = @JoinColumn(name = "fk_student_id"))
    private List<Student> student;
}
