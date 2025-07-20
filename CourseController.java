package com.data.controller;

import com.data.model.Course;
import com.data.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

    @Autowired
    private CourseRepository courseRepo;

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseRepo.save(course);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }
}

