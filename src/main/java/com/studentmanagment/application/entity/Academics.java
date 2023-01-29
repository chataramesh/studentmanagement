package com.studentmanagment.application.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.studentmanagment.application.common.BaseEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "academics")
@Getter
@Setter
@NoArgsConstructor
public class Academics extends BaseEntity {
	private String AcademicYear;
	private String AcademicBlock;
	private String AcademicBlockAddress;

	@ManyToOne
	private Address address;

	public String getAcademicYear() {
		return AcademicYear;
	}

	public void setAcademicYear(String academicYear) {
		AcademicYear = academicYear;
	}

	public String getAcademicBlock() {
		return AcademicBlock;
	}

	public void setAcademicBlock(String academicBlock) {
		AcademicBlock = academicBlock;
	}

	public String getAcademicBlockAddress() {
		return AcademicBlockAddress;
	}

	public void setAcademicBlockAddress(String academicBlockAddress) {
		AcademicBlockAddress = academicBlockAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
