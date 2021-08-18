package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;
import com.model.Employee;

@RestController
public class FirstController {
	@RequestMapping(value="one")//endpoint
public String sayHello()
{
	return "Welcome to  Spring Rest";
}
	/*@RequestMapping(value="emp",method=RequestMethod.GET,produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	//@GetMapping
	public Employee getEmployee()
	{
		return new Employee(10,"Ten",1010.10f);
	}*/
	@RequestMapping(value="emp",method=RequestMethod.GET,produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})//http://localhost:9090/pn/emp
	   // @GetMapping
	    public ResponseEntity<Employee> getEmployee() {
	       
	        Employee emp=new Employee(30, "satish", 123.5f);
	        return new ResponseEntity<Employee>(emp, HttpStatus.NOT_FOUND);
	    }
	@RequestMapping(value="emppath/{abc}",method=RequestMethod.GET)
	//@GetMapping
	public Employee getEmployeeById(@PathVariable("abc") int arg)
	{
		Employee employee=null;
		if(arg==20)
		{
			employee= new Employee(20,"Twenty",20202.20f);
		}
		if(arg==30)
		{
			employee= new Employee(30,"Thirty",3030.30f);
		}
		return employee;
	}
	@RequestMapping(value="empall",method=RequestMethod.GET)
	public List<Employee> getAllEmployees()
	{
		Employee employee1=new Employee(20,"Twenty",2020.20f);
		Employee employee2=new Employee(30,"Thirty",3030.20f);
		Employee employee3=new Employee(40,"fourty",4040.20f);
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		return employees;
	}
	
	 
	@RequestMapping(value="empcreate",method=RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee)
	{
		System.out.println("server side emp id:"+employee.getEmpNo());
		System.out.println("server side emp name:"+employee.getEmpName());
		
		return employee;
	}
	@RequestMapping(value="empupdate",method=RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		System.out.println("server side update emp id:"+employee.getEmpNo());
		System.out.println("server side update emp name:"+employee.getEmpName());
		System.out.println("server side update emp name:"+employee.getSalary());
		employee.setSalary(5000);
		return employee;
}
	@RequestMapping(value="empdelete/{abc}",method=RequestMethod.DELETE)
	//@GetMapping
	public boolean deleteEmployeeById(@PathVariable("abc") int arg)
	{
		System.out.println("employee no" +arg+"is deleted");
		return true;
	}
}