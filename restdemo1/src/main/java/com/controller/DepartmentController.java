package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;
import com.model.Employee;

@RestController

public class DepartmentController {
	@GetMapping(value="dept/{alias}")
public Department getDepartmentById(@PathVariable("alias") int deptId)
{
	Department department=new Department();
	if(deptId==100)
	{
		department.setDeptNo(deptId);
		department.setDeptName("Development");
		Employee employee=new Employee(123,"OneTwoThree",123.45f);
		department.setEmployee(employee);
		
	}
	if(deptId==200)
	{
		department.setDeptNo(200);
		department.setDeptName("Testing");
		Employee employee=new Employee(456,"FourFiveSix",4455.66f);
		department.setEmployee(employee);
	}
	return department;
}
	@GetMapping(value="deptpath/{​​​​​​​deptId}​​​​​​​")
    public Department getAllDepartments(@PathVariable int deptId)
    {
	 Department department=new Department();
        if(deptId==100)
        {
        	department.setDeptNo(deptId);
            department.setDeptName("HCL TECHNOLOGIES");
            Employee employee1=new Employee(20,"Twenty",2020.20f);
            Employee employee2=new Employee(30,"Thirty",3030.30f);
            Employee employee3=new Employee(40,"Fourty",4040.40f);
            List<Employee> lsemp=new ArrayList<Employee>();
           
           
            lsemp.add(employee1);   
            lsemp.add(employee2);   
            lsemp.add(employee3);   
            department.setLsemp(lsemp);
        }
        return department;
    }
}