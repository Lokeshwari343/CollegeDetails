package com.example.CollegeDetails.repository;

import com.example.CollegeInfo.model.College;
import com.example.CollegeInfo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface collegerepo  extends JpaRepository<College,Long> {
    List<Department> findByname(String name);


    College findByName(String name);


}