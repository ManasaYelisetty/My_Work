package com.springbootdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo1.model.Student;
import com.springbootdemo1.service.StudentServiceIntf;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceIntf studentServiceIntf;
	@PostMapping(value="/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		Student dummy=studentServiceIntf.saveStudent( student);
		return new ResponseEntity<Student>(dummy,HttpStatus.OK);
	}
	@GetMapping(value="/read/{Manasa}")
	public ResponseEntity<Student> readStudentById(@PathVariable("Manasa") Integer studId)
	{
		Student dummy  =studentServiceIntf.readStudentById (studId);
		return new ResponseEntity<Student>(dummy,HttpStatus.OK);
	}
	@GetMapping(value="/readall")
	public ResponseEntity<List<Student>> readAll()
	{
		List<Student> dummy=studentServiceIntf.readAll();
		return new ResponseEntity<List<Student>>(dummy,HttpStatus.OK);
	}
	@PutMapping(value="/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student)
	{
		Student dummy=studentServiceIntf.updateStudent(student);
		return new ResponseEntity<Student>(dummy,HttpStatus.OK);
	}
	@DeleteMapping(value="delete/{Manasa}")
	public boolean deleteStudent(@PathVariable("Manasa") Integer studId )
	{
		studentServiceIntf.deleteStudent( studId );
		return true;
	}
	
}
