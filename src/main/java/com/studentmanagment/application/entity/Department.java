package com.studentmanagment.application.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.studentmanagment.application.common.BaseEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="department")
@Getter
@Setter
@NoArgsConstructor
public class Department extends BaseEntity {

	private String departmentName;
	

	@ManyToOne
	private Address address;
}
