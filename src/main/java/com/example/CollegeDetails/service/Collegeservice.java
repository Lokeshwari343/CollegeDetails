package com.example.CollegeDetails.service;

import com.example.CollegeInfo.model.College;
import com.example.CollegeInfo.model.Department;
import com.example.CollegeInfo.repository.collegerepo;
import com.example.CollegeInfo.repository.departmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    private collegerepo collegeRepository;


    public College addCollege(College college) {
        return collegeRepository.save(college);
    }


    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }


    public College getCollegeById(Long id) {
        return collegeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("College not found with id: " + id));
    }


    /*public College getCollegeByName(String name) {
        return collegeRepository.findByName(name);

    }*/

    public College updateCollegeName(Long id, String newName) {
        College college = getCollegeById(id);
        college.setName(newName);
        return collegeRepository.save(college);
    }


    public void deleteCollegeById(Long id) {
        College college = getCollegeById(id);
        collegeRepository.delete(college);
    }
}}