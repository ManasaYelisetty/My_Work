package com.springbootdemo1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootdemo1.model.Student;
@Service
public class StudentServiceImpl implements StudentServiceIntf {

	@Override
	public Student saveStudent(Student student) {
		System.out.println("student"+ student.getStudId());
		System.out.println("student" +student.getStudentName());
		return student;
	}

	@Override
	public Student readStudentById(Integer studId) {
		Student student=null;
		if(studId==10)
		{
			student=new Student();
			student.setStudId(studId);
			student.setStudentName("mango");
			student.setMark1(97);
			student.setMark2(80);
			
		}
		return student;
	}

	@Override
	public List<Student> readAll() {
		List<Student> students=new ArrayList();
		Student student=new Student();
		student.setStudId(25);
		student.setStudentName("mango");
		student.setMark1(97);
		student.setMark2(80);
		Student student1=new Student();
		student1.setStudId(28);
		student1.setStudentName("banana");
		student1.setMark1(95);
		student1.setMark2(82);
		students.add(student1);
		students.add(student);
		return students;
	}

	@Override
	public Student updateStudent(Student student) {
		System.out.println("student update"+ student.getStudId());
		System.out.println("student update" +student.getStudentName());
		return student;
	}

	@Override
	public boolean deleteStudent(Integer studId) {
		
		return true;
	}

}
