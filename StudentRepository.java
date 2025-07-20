package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
