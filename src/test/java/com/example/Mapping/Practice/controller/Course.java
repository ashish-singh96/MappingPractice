package com.example.Mapping.Practice.controller;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    private String ID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany(mappedBy = "courses")
    private List<Student> studentList;

    // Constructor, getters, and setters
}
