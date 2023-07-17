package com.assignment.StudentManagement.repository;

import com.assignment.StudentManagement.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,Integer> {
}
