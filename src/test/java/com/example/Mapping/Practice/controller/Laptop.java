package com.example.Mapping.Practice.controller;

import javax.persistence.*;

@Entity
public class Laptop {
    @Id
    private String ID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne(mappedBy = "laptop")
    private Student student;

    // Constructor, getters, and setters
}
