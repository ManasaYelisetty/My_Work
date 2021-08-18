package com.springbootdemo1.service;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.springbootdemo1.model.Student;

public interface StudentServiceIntf {
	public abstract Student saveStudent(Student student);
	public abstract Student readStudentById( Integer studId);
	public abstract List<Student> readAll();
	public abstract Student updateStudent(Student student);
	public abstract  boolean deleteStudent(Integer studId );
}
