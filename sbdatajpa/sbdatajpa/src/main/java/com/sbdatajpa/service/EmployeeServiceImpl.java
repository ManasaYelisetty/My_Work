package com.sbdatajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbdatajpa.dao.EmployeeRepository;
import com.sbdatajpa.model.Employee;

@Service
public  class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	// @Transactional
	public List<Employee> listAll() {
		return employeeRepository.findAll();
	}

	@Override
	// @Transactional
	public Employee readByEmployeeId(Integer abc) {
		Employee employee = null;
		Optional<Employee> optional = employeeRepository.findById(abc);
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			System.err.println("empty");// raise an exception
		}
		return employee;
	}

	@Override
	@Transactional
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);

	}

	@Override
	@Transactional
	public Integer delete(Integer efg) {
		employeeRepository.deleteById(efg);
		return efg;

	}

	@Override
	public String searchByDesignation(Integer hij) {
		return employeeRepository.getByDesignation(hij);
	}

	@Override
	public List<Employee> sortBySalaryDesc() {
		
		return employeeRepository.sortBySalaryDesc();
	}

	@Override
	public List<Employee> sortBySalary() {
		return employeeRepository.sortBySalary();
	}

	@Override
	public List<Employee> getNameById(Integer id) {
		return employeeRepository.getNameById(id);
	}

	@Override
	public List<String> getName(Integer id) {
		return employeeRepository.getName(id);
	}

	@Override
	public Employee getValues(Integer id, float salary) {
		return employeeRepository.getValues(id, salary);
	}
	}

	


