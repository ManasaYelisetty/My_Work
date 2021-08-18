package com.SpringBootAngular.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootAngular.model.Customer;
import com.SpringBootAngular.repository.CustomerRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {

	private Logger log = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	CustomerRepository repository;

	 @PostMapping(value = "/customers")
	  public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
	    try {
	        log.info("Inside Post Customer");
	      Customer _customer = repository.save(new Customer(customer.getName(), customer.getAge(),customer.getGender()));
	      return new ResponseEntity<>(_customer, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
	    }
	  }

	
	 
     @GetMapping("/customers")
 public ResponseEntity<List<Customer>> getAllCustomers() {​​​​​​​
   List<Customer> customers = new ArrayList<Customer>();
   try {​​​​​​​
     repository.findAll().forEach(customers::add);
    
     if (customers.isEmpty()) {​​​​​​​
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
     }​​​​​​​
     return new ResponseEntity<>(customers, HttpStatus.OK);
   }​​​​​​​ catch (Exception e) {​​​​​​​
     return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
   }​​​​​​​
 }​​​​​​​


}
