package com.sbjunit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbjunit.model.Employee;

@RestController
public class EmployeeController {
	@RequestMapping(value="employee")
	public Employee getEmployee()
	{
		return new Employee(10,"Lunch",1010.10f);
	}
}
