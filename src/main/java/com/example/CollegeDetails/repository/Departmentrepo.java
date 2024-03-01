package com.example.CollegeDetails.repository;
import com.example.CollegeInfo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface departmentrepo extends JpaRepository<Department,Integer>{
    List<Department> findByCollegeName(String collegeName);

}