package com.SpringBootAngularDemo.repository;

 

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootAngularDemo.model.Customer;

 


 

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByAge(int age);
 

}