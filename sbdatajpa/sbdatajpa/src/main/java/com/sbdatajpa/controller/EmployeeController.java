package com.sbdatajpa.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbdatajpa.model.Employee;
import com.sbdatajpa.service.EmployeeService;

@RestController
@RequestMapping(value="employee")
public class EmployeeController {
	@Autowired   //has a ==wired ==DI
	private EmployeeService employeeService;
		@GetMapping(value="all")
	public List<Employee> list()
	{
		return employeeService.listAll();
	}
		@GetMapping(value="read/{data}")
		public Employee  read(@PathVariable("data")  Integer id)
		{
			return employeeService.readByEmployeeId(id);
		}
		@PostMapping(value="save")
		public ResponseEntity<Employee> save(@RequestBody Employee employee)
		{
			return new ResponseEntity<Employee>(employeeService.save(employee),HttpStatus.OK);
		}
		@PutMapping(value="update")
		public ResponseEntity<Employee> update(@RequestBody Employee employee)
		{
			return new ResponseEntity<Employee>(employeeService.save(employee),HttpStatus.OK);
		}
		@DeleteMapping(value="delete/{data}")
		public Integer delete(@PathVariable("data")  Integer id)
		{
			return employeeService.delete(id);
		}
		@GetMapping(value="/des/{sapid}")
		public ResponseEntity<String> searchByDesignation(@PathVariable Integer sapid)
		{
			String result= employeeService.searchByDesignation(sapid);
			return new ResponseEntity<String>(result,HttpStatus.OK);
		}
		@GetMapping(value="sortdesc")
		public List<Employee> sortEmployees(){
		    return employeeService.sortBySalaryDesc();
		}
		@GetMapping(value="sort")
		public List<Employee> fetchEmployees(){
		    return employeeService.sortBySalary();
		}
		@GetMapping(value="empname/{id}")
		public List<Employee> getEmployeeName(@PathVariable Integer id){
		    return employeeService.getNameById(id);
		}
		@GetMapping(value="name/{id}")
		public List<String> getName(@PathVariable Integer id){
		    return employeeService.getName(id);
		}
		@GetMapping(value="name/{id}/{salary}")
		public Employee getValues(@PathVariable Integer id,@PathVariable float salary){
		    return employeeService.getValues(id,salary);
		}
		
	
}
