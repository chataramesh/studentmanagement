package com.studentmanagment.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagment.application.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
