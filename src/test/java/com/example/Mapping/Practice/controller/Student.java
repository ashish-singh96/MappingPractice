package com.example.Mapping.Practice.controller;



@Entity
public class Student {
    @Id
    private String ID;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    // Constructor, getters, and setters
}
