package com.sbvalidation.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sbvalidation.model.Employee;

@RestController
@Validated
public class EmployeeController {

	@PostMapping("add")
    public ResponseEntity<String> addEmployees(@RequestBody @Valid Employee employee){
        System.out.println(employee.getEmpNo());
        System.out.println(employee.getFirstName());
    System.out.println(employee.getEmail());
    System.out.println(employee.getMobilePhone());
    System.out.println(employee.getBirthday());
    return  ResponseEntity.ok("use is valid");
    }
	@GetMapping("/")
	public ResponseEntity<Employee> getEmployee()
	{
		Employee employee=new Employee(10,"ten","ten@gmail.com","123-456-6789",LocalDate.now());
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@GetMapping("/read/{pathname}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("pathname")  @Size(min = 3, message = "Name should hace min 3 characters") String empName)
	{
		Employee employee=null;
		if(empName.equals("hello"))
		{
		
		employee=new Employee(10,"hello","hello@gmail.com","123-456-6789",LocalDate.now());
		}
		if(empName.equals("world"))
		{
		
		 employee=new Employee(20,"world","world@gmail.com","123-456-6789",LocalDate.now());
		}
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

    @ResponseStatus(HttpStatus.BAD_REQUEST)
@ExceptionHandler(MethodArgumentNotValidException.class)
public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
    Map<String, String> errors = new HashMap<>();

    ex.getBindingResult().getFieldErrors().forEach(error ->
        errors.put(error.getField(), error.getDefaultMessage()));
    
    return errors;
}

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(ConstraintViolationException.class)
    public Map<String, String> handleConstraintViolation(ConstraintViolationException ex) {
        Map<String, String> errors = new HashMap<>();
        
        ex.getConstraintViolations().forEach(cv -> {
            errors.put("message", cv.getMessage());
            errors.put("path", (cv.getPropertyPath()).toString());
        });
    
        return errors;
    }

 

}
