package com.data.controller;

import com.data.model.Course;
import com.data.model.Enrollment;
import com.data.model.Student;
import com.data.repository.CourseRepository;
import com.data.repository.EnrollmentRepository;
import com.data.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
@CrossOrigin(origins = "http://localhost:3000")
public class EnrollmentController {

    @Autowired
    private EnrollmentRepository enrollmentRepo;

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private CourseRepository courseRepo;

    @PostMapping
    public Enrollment enrollStudent(
            @RequestParam Long studentId,
            @RequestParam Long courseId,
            @RequestParam(defaultValue = "Active") String status) {

        Student student = studentRepo.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Course course = courseRepo.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);
        enrollment.setStatus(status);

        return enrollmentRepo.save(enrollment);
    }

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepo.findAll();
    }
}
