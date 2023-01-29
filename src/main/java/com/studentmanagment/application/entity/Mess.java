package com.studentmanagment.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.studentmanagment.application.common.BaseEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mess")
@Getter
@Setter
@NoArgsConstructor
public class Mess extends BaseEntity {

	private String messName;

	private String messAddress;

	@ManyToOne
	private Address address;

}
