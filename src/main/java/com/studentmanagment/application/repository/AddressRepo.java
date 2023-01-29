package com.studentmanagment.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagment.application.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
