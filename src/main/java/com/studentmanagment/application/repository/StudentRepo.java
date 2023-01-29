package com.studentmanagment.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagment.application.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
