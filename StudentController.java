// StudentController.java
package com.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.data.model.Student;
import com.data.repository.StudentRepository;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}

