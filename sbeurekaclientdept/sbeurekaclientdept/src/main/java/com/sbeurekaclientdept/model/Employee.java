package com.sbeurekaclientdept.model;

public class Employee {
	private Integer empNo;
	private String empName;
	private float salary;

	public Employee() {
		super();
	}

	public Employee(Integer empNo, String empName, float salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
