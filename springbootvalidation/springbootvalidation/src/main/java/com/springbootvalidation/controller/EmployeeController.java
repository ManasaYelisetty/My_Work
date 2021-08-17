package com.springbootvalidation.controller;


import javax.validation.Valid;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootvalidation.model.Employee;

@RestController
@Validated
public class EmployeeController {
	@PostMapping(value="create")
		public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee)
		{
			//service  --.repository
			
			System.out.println("Server side employee no:"+employee.getEmpNo());
			System.out.println("Server side employee first name:"+employee.getFirstName());
			System.out.println("Server side employee last name:"+employee.getLastName());
			ResponseEntity<Employee> responseEntity=new ResponseEntity<Employee>(employee,HttpStatus.OK);
			return responseEntity;
			
		}
	@PostMapping(value="read")
	public Employee readEmployee()
	{
		return new Employee(10,"Hello","World");
	}
	
	@GetMapping(value="read/{id}")
	public ResponseEntity<String> readEmployee(@PathVariable("id") @Size(min=3) int id){
	    System.out.println(id);
	    return  ResponseEntity.ok("valid");
	   
	}
}
