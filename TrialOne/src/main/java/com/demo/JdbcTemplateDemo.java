package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateDemo {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		/*EmployeeDao dao=context.getBean("emp",EmployeeDao.class);
		Employee emp=new Employee(1,"manasa");
		Employee e=new Employee(1,"mani");
		//dao.insertEmployee(emp);
		//dao.updateEmployee(e);
*/	
		EmployeeDao dao=context.getBean("emp",EmployeeDao.class);
		List<Employee> ls=dao.fetchEmployees();
		ls.forEach(emp->System.out.println(emp));
		System.out.println("success");
	}

}
