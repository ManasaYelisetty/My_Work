package com.sbeurekaclientdept.controller;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.sbeurekaclientdept.model.Department;
import com.sbeurekaclientdept.model.Employee;
@RestController

public class DepartmentController {
	@Autowired
    private DiscoveryClient discoveryClient;


    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "dept/{​​​​​​​dept_empid}​​​​​​​")
    public ResponseEntity<Department> getEmployeeDetail(@PathVariable("dept_empid") Integer abc)
    {
    	HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);


        ServiceInstance serviceInstance = discoveryClient.getInstances("Employeeproducer").get(0);
        String url = serviceInstance.getUri().toString(); // http://localhost:8084


        String realUrl = url +"/search"+abc;


        Employee empfromProducer = restTemplate.exchange(realUrl, HttpMethod.GET, entity, Employee.class).getBody();


        Department department = new Department(150, "Testing", empfromProducer);
        return new ResponseEntity<>(department, HttpStatus.OK);

    }
		//using portno
		/*@Autowired
		private RestTemplate restTemplate;
		@GetMapping(value="dept/{dept_empid}")
	public ResponseEntity<Department> getEmployeeDetails(@PathVariable("dept_empid") int abc){
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
        String url="http://localhost:8084/search/" + abc;
        Employee empfromEmpProducer=restTemplate.exchange(url,HttpMethod.GET,entity,Employee.class).getBody();
       Department department=new Department(420,"development",empfromEmpProducer);
        return new ResponseEntity<>(department,HttpStatus.OK);
}*/
}