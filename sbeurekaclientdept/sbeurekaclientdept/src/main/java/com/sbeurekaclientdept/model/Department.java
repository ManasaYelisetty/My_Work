package com.sbeurekaclientdept.model;

public class Department {
	private Integer deptId;
	private String deptName;
	private Employee employee;
	public Department() {
		super();
	}
	public Department(Integer deptId, String deptName, Employee employee) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employee = employee;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
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
