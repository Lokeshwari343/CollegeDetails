package com.example.CollegeDetails.service;

import com.example.CollegeInfo.model.Department;
import com.example.CollegeInfo.model.Faculty;
import com.example.CollegeInfo.repository.departmentrepo;
import com.example.CollegeInfo.repository.facultyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    /*@Autowired
    private departmentrepo departmentrepo;
    @Autowired
    private Collegerepo collegerepo;
    public Department addDepartment(Department department) {
        return null;
    }*/

    @Autowired
    private departmentrepo departmentRepository;


    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getDepartmentsByCollegeName(String collegeName) {
        return departmentRepository.findByCollegeName(collegeName);
    }
}