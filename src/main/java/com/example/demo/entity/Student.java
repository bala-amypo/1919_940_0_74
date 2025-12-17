package com.example.demo.entity;

import java.time.LocalDate;
@Entity
@Table(name")
public class Student {
    
    private long id;
    private String name;
    private String email;
    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Student(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public Student() {
    }
}