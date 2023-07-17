package com.assignment.StudentManagement.controller;

import com.assignment.StudentManagement.model.Student;
import com.assignment.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    /// post student
    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    // Get All students
    @GetMapping("students")
    public List<Student> getAllStudent(){
        return studentService.gateStudents();
    }

    // Delete student
    @DeleteMapping("student/id/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return studentService.removeStudentById(id);
    }

    // Update student department by id
    @PutMapping("student/id/{id}/department/{department}")
    public String updateStudentDepartment(@PathVariable Integer id, @PathVariable String department){
        return studentService.updateDepartmentById(id,department);
    }

}
