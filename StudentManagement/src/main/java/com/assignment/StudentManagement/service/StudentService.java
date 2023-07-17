package com.assignment.StudentManagement.service;

import com.assignment.StudentManagement.model.Student;
import com.assignment.StudentManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String createStudent(Student student) {

        return "Added Successfully.."+ studentRepo.save(student);
    }

    public List<Student> gateStudents() {
        return studentRepo.findAll();
    }

    public String removeStudentById(Integer id) {
        studentRepo.deleteById(id);
        return "Deleted Successfully....!!!!!!";
    }

    public String updateDepartmentById(Integer id, String department) {
        Optional<Student> optionalStudent = studentRepo.findById(id);
        Student existStudent = optionalStudent.get();
         if(existStudent == null){
            return "Student does not exist of Id :: "+id;
        }
         existStudent.setStudentDepartment(department);
         studentRepo.save(existStudent);
        return "Updated successfully .....!!! with " + department+", and Id : "+id;
    }
}
