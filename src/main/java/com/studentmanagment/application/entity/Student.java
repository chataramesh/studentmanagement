package com.studentmanagment.application.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.studentmanagment.application.common.BaseEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class Student extends BaseEntity {

	private String studentName;
	private String StudentPhone;
	private String studentMail;
	private String studentUsername;
	private String studentPassword;

	@ManyToOne
	private Hostel hostel;

	@ManyToOne
	private Address address;

	@ManyToOne
	private Mess mess;

	@ManyToOne
	private Academics academics;

	@ManyToOne
	private Department department;

}
