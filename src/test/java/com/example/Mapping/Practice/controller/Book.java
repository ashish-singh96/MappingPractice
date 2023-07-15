package com.example.Mapping.Practice.controller;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    private String ID;
    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    private Student student;

    // Constructor, getters, and setters
}
