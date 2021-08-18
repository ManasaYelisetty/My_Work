package com.hystrixdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hystrixdemo.model.Student;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class StudentController {
		@GetMapping(value="stud/{var}")
		@HystrixCommand(fallbackMethod="getFallback")
		public ResponseEntity<Student> getStudent(@PathVariable("var") int abc)
		{
			Student student=null;
			System.out.println("Inside getStudent() in StudentController");//log.info()
			if(abc==100)
			{
				student=new Student(100,"Hundred",98.8f);
			}
			if(abc!=100)
			{
				throw new RuntimeException();
			}
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		//solution if not available/
		public ResponseEntity<Student> getFallback(int abc)
		{
			System.out.println("Inside getFallback() in controller");
			Student student=new Student(0,"empty student",00.00f);
			return new ResponseEntity(student,HttpStatus.OK);
		}
}
