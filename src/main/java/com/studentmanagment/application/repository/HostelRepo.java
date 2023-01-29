package com.studentmanagment.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagment.application.entity.Hostel;

public interface HostelRepo extends JpaRepository<Hostel, Long> {

}
