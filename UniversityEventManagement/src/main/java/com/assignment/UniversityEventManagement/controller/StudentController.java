package com.assignment.UniversityEventManagement.controller;

import com.assignment.UniversityEventManagement.model.Department;
import com.assignment.UniversityEventManagement.model.Student;
import com.assignment.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

          //Get
    //get all students
    @GetMapping("students")
    public Iterable<Student> showAllStudents(){
       return  studentService.getAllStudents();
    }

    //get student by id
    @GetMapping("student/id/{id}")
    public Optional<Student> showStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    // Post
    // Add Student
    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }


    // Delete
    // delete student
    @DeleteMapping("student/id/{id}")
    public String removeStudentById(@PathVariable Integer id){
        return studentService.deleteStudentById(id);
    }


    //Update or Put
    // update student department
     @PutMapping("student/id/{id}/department/{department}")
    public String updateStudentDepartmentById(@PathVariable Integer id, @PathVariable Department department){
          return studentService.updateDepartmentBYId(id,department);
    }
}
