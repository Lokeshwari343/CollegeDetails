package com.example.CollegeDetails.controller;
import com.example.CollegeInfo.model.Department;
import com.example.CollegeInfo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
    @Autowired
    private Departmentservice departmentService;

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {
        Department addedDepartment = departmentService.addDepartment(department);
        return addedDepartment;
    }

    @GetMapping("/college/{collegeName}")
    public List<Department> getDepartmentsByCollegeName(@PathVariable String collegeName) {
        List<Department> departments = departmentService.getDepartmentsByCollegeName(collegeName);
        return departments;
    }


}
