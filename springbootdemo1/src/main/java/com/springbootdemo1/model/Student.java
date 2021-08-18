package com.springbootdemo1.model;


//POJO standard  variables must be private it(variables and methods) should start with lower case 
//and follow camel case  and have default constructor
public class Student {
	private Integer studId;
	private String studentName;
	private int mark1;
	private int mark2;
	public Student() {
		super();
	}
	public Student(Integer studId, String studentName, int mark1, int mark2) {
		super();
		this.studId = studId;
		this.studentName = studentName;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	
	
}
