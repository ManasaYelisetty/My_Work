package com.hystrixdemo.model;

public class Student {
	private int studId;
	private String studName;
	private float marks;

	public Student() {
		super();
	}

	public Student(int studId, String studName, float marks) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public float getMark() {
		return marks;
	}

	public void setMark(float marks) {
		this.marks = marks;
	}

}
