package com.developer.employeemanagement.entity;

import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="mt_employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="gender")
	private String gender;
	@Column(name="dateOfBirthDay")
	private Date dateOfBirthDay;
	@Column(name="address")
	private String address;
}
