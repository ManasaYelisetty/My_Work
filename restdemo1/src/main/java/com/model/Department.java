package com.model;

import java.util.List;

public class Department {
	private int deptNo;
	private String deptName;
	private Employee employee;//one to one mapping
	//private List<Employee> employee;
	 private List<Employee> lsemp;
	 
	public List<Employee> getLsemp() {
		return lsemp;
	}

	public void setLsemp(List<Employee> lsemp) {
		this.lsemp = lsemp;
	}

	public Department() {
		super();
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
