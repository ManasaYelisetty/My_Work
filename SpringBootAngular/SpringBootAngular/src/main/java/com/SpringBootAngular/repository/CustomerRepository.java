package com.SpringBootAngular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootAngular.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
