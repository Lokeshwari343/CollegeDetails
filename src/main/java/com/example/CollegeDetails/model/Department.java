package com.example.CollegeDetails.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue
    public Long id;
    public String name;
    public String hod;
    public String description;
    public String code;
    public String email;

    @ManyToOne
    @JoinColumn(name = "college_id")
    @JsonIgnore
    private College college;


    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    public List<Faculty> faculties;
}