package com.example.CollegeDetails.controller;
import com.example.CollegeInfo.model.Faculty;
import com.example.CollegeInfo.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")

public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @PostMapping
    public Faculty addFaculty(@RequestBody Faculty faculty) {
        Faculty addedFaculty = facultyService.addFaculty(faculty);
        return addedFaculty;
    }

    @GetMapping("/department/{departmentName}")
    public List<Faculty> getFacultiesByDepartmentName(@PathVariable String departmentName) {
        List<Faculty> faculties = facultyService.getFacultiesByDepartmentName(departmentName);
        return faculties;
    }

}