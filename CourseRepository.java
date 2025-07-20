package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
