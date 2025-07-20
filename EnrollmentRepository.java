package com.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Long> {

}
