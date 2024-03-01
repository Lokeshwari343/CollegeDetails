package com.example.CollegeDetails.repository;

import com.example.CollegeInfo.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface facultyrepo extends JpaRepository<Faculty,Integer>{
    List<Faculty> findByDepartmentName(String departmentName);

}