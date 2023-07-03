package com.assignment.UniversityEventManagement.service;

import com.assignment.UniversityEventManagement.model.Department;
import com.assignment.UniversityEventManagement.model.Student;
import com.assignment.UniversityEventManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public Iterable<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Integer id) {
        return studentRepo.findById(id);
    }

    public String addStudent(Student student) {
       Student st =   studentRepo.save(student);
       if(st!=null){
           return "Added Successfully .....!!!!!!!!!";
       }
       return "Not Added ..!!!";
    }

    public String deleteStudentById(Integer id) {
         Optional<Student> st = studentRepo.findById(id);
         studentRepo.deleteById(id);
         return "Deleted successfully ....!!!!!!";
    }

    public String updateDepartmentBYId(Integer id, Department department) {
          Optional<Student> myStuOp =  studentRepo.findById(id);
       Student myStu = null;
       if(myStuOp.isPresent()){
           myStu = myStuOp.get();
       }else{
           return "Id does not exist >>>>!!!";
       }
       myStu.setDepartment(department);
       studentRepo.save(myStu);

       return "Updated Successfully ...!!!!";
    }
}
