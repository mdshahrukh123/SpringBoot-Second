package com.assignment.StudentManagement.service;

import com.assignment.StudentManagement.model.Course;
import com.assignment.StudentManagement.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;


    public String createCourse(Course course) {
        courseRepo.save(course);
     return " added successfully...!!!!";
    }

    public List<Course> gatCourses() {
        return courseRepo.findAll();
    }
}
