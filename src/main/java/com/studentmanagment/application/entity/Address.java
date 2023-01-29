package com.studentmanagment.application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.studentmanagment.application.common.BaseEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="address")
@Getter
@Setter
@NoArgsConstructor
public class Address extends BaseEntity {
	
	private String village;
	private String mandal;
	private String district; 
	private String state;
	private String pincode;
	private String street;
	


}
