package com.data.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Enrollment> enrollments = new ArrayList<>();

    // Constructors
    public Student() {}

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Student(Long id, String name, String email, List<Enrollment> enrollments) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enrollments = enrollments;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}

