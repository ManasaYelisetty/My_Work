package com.springbootvalidation.model;

import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Employee {
	private Integer empNo;
	@NotNull
	@Size(min=3,message="name should be minimum 3 characters")
	private String firstName;
	@NotNull
	private String lastName;

	public Employee() {
		super();
	}

	public Employee(Integer empNo, String firstName, String lastName) {
		super();
		this.empNo = empNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
