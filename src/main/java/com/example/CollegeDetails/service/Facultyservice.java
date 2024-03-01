package com.example.CollegeDetails.service;

import com.example.CollegeInfo.model.Faculty;
import com.example.CollegeInfo.repository.facultyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {
    @Autowired
    private facultyrepo facultyRepository;


    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }


    public List<Faculty> getFacultiesByDepartmentName(String departmentName) {
        return facultyRepository.findByDepartmentName(departmentName);
    }
}