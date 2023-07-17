package com.assignment.StudentManagement.controller;

import com.assignment.StudentManagement.model.Course;
import com.assignment.StudentManagement.model.Student;
import com.assignment.StudentManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    /// post course
    @PostMapping("course")
    public String addCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

    // Get All courses
    @GetMapping("courses")
    public List<Course> getAllCourse(){
        return courseService.gatCourses();
    }
}
