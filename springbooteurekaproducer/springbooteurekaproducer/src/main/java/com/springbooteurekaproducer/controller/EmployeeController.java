package com.springbooteurekaproducer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springbooteurekaproducer.model.Employee;

@RestController
public class EmployeeController {
	@GetMapping(value="search/{alias}")
public ResponseEntity<Employee> getEmployeeById(@PathVariable("alias") Integer empNo)
{
	Employee employee=null;
	if(empNo==10)
	{
		employee=new Employee(10,"Ten",1010.10f);
	}
	if(empNo==20)
	{
		employee=new Employee(20,"Twenty",2020.10f);
	}
	return new ResponseEntity<Employee>(employee,HttpStatus.OK);
}
}
