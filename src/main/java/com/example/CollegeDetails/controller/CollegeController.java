package com.example.CollegeDetails.controller;

import com.example.CollegeInfo.model.College;
import com.example.CollegeInfo.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    private Collegeservice collegeservice;

    @PostMapping
    public ResponseEntity<College> addCollege(@RequestBody College college) {
        College addedCollege = collegeservice.addCollege(college);
        return new ResponseEntity<>(addedCollege, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<College>> getAllColleges() {
        List<College> colleges = collegeservice.getAllColleges();
        return new ResponseEntity<>(colleges, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable Long id) {
        College college = collegeservice.getCollegeById(id);
        return college;
    }

    /*@GetMapping("/name/{name}")
    public ResponseEntity<College> getCollegeByName(@PathVariable String name) {
        College college = collegeservice.getCollegeByName(name);
        return new ResponseEntity<>(college, HttpStatus.OK);
    }*/

    @PutMapping("/{id}")
    public ResponseEntity<College> updateCollegeName(@PathVariable Long id, @RequestParam String newName) {
        College updatedCollege = collegeservice.updateCollegeName(id, newName);
        return new ResponseEntity<>(updatedCollege, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCollegeById(@PathVariable Long id) {
        collegeservice.deleteCollegeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}