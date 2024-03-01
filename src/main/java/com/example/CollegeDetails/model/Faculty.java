package com.example.CollegeDetails.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String email;
    public String gender;
    public String contact;
    public String qualification;
    public String position;
    public String description;

    @ManyToOne

    @JoinColumn(name = "department_id")
    @JsonIgnore

    private Department department;
}