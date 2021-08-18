package com.sbdatajpa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="employeejpa")
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer empId;
	@Column(name="emp_name",length=25)
	private String empName;
	@Column(name="emp_desig",length=25)
	private String designation;
	
	private float salary;
	@JsonManagedReference
   // @OneToMany(mappedBy = "employee", cascade = {​​​​​​​ CascadeType.ALL }​​​​​​​)
   @OneToMany(mappedBy="employee", cascade= {CascadeType.ALL})//variable in address class-bidirectional
 

	private List<Address> addresses;

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Employee() {
		super();
	}

	public Employee(String empName, String designation, float salary) {
		super();
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
