package com.sbdatajpa.service;

import java.util.List;

import com.sbdatajpa.model.Employee;

public interface EmployeeService {

		public abstract List<Employee> listAll(); //r
		public abstract Employee readByEmployeeId(Integer abc);
		public abstract Employee save(Employee employee); //c
		public abstract Integer delete(Integer efg);
		public abstract String searchByDesignation(Integer hij);
		public abstract List<Employee> sortBySalaryDesc();
		public abstract List<Employee> sortBySalary();
		public abstract List<Employee> getNameById(Integer id);
		public abstract List<String> getName(Integer id);
		public abstract Employee getValues(Integer id, float salary);
		
}
