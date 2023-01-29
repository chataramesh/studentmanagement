package com.studentmanagment.application.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.studentmanagment.application.common.BaseEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hostel")
@Getter
@Setter
@NoArgsConstructor
public class Hostel extends BaseEntity {

	private String hostelName;
	private String hostelAddress;
	private String hostelNumber;

	@ManyToOne
	private Address address;
}
