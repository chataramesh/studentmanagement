package com.studentmanagment.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagment.application.entity.Mess;

public interface MessRepo extends JpaRepository<Mess, Long> {

}
