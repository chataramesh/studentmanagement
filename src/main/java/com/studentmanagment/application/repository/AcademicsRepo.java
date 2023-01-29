package com.studentmanagment.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmanagment.application.entity.Academics;

@Repository
public interface AcademicsRepo extends JpaRepository<Academics, Long> {

}
