package com.sbeurekaclient1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sbeurekaclient1.model.Employee;

@RestController
public class EmployeeController {
	@GetMapping(value="search/{ui_empid}")
		public ResponseEntity<Employee> getEmployeeById(@PathVariable("ui_empid")  Integer empId)
		{
		Employee employee=null;
		if(empId==10)
		{
			employee=new Employee(10,"Tea",123.45f);
		}
		if(empId==20)
		{
			employee=new Employee(20,"Twnty",6789.45f);
		}
		ResponseEntity<Employee> responseEntity=new ResponseEntity<Employee>(employee,HttpStatus.OK);	
		return responseEntity;
		}
}
