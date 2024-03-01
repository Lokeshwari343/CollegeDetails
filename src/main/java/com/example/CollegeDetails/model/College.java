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
@Table(name = "colleges") // Changed table name to "colleges"
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String address;
    public String email;
    public String phone;
    public String website;
    public String description;


    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL) // Added cascade type
    public List<Department> departments;
}

    }

