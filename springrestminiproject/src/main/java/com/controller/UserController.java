package com.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.UserException;
import com.model.User;
import com.service.UserService;

@RestController
public class UserController {
	@Autowired
	private User user;
	@Autowired
	private UserException userException;
	@Autowired
	private UserService userService;
	@GetMapping(value="user")
public ResponseEntity<User> getUser()
{
	
	ResponseEntity responseEntity=null;
	User temp=userService.getUser();
	if(temp!=null)
	{
		responseEntity=new ResponseEntity(temp,HttpStatus.OK);
	}
	else
	{
		responseEntity=new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	return responseEntity;
}
	
	@GetMapping(value="username/{userName}")
	public ResponseEntity<User> getUserByName(@PathVariable String userName) throws Exception
	{
		ResponseEntity responseEntity=null;
		if(userName.length() >0)
		{
			User temp=userService.getUserByName(userName);
			responseEntity=new ResponseEntity(temp,HttpStatus.OK);
		}
		else
		{
			responseEntity=new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		
		return responseEntity;
		
	}
	@GetMapping(value="userid/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable Integer userId)
	{
		return new ResponseEntity(user,HttpStatus.OK);
	}
	@GetMapping(value="userlist")
	public ResponseEntity<List<User>> getUsers()
	{
		return new ResponseEntity(user,HttpStatus.OK);
	}
	@PostMapping(value="useradd")
	public ResponseEntity<User> addUsers(@RequestBody User user)
	{
		return new ResponseEntity(user,HttpStatus.OK);
	}
	@PutMapping(value="userupdate")
	public ResponseEntity<User> updateUser(@RequestBody User user)
	{
		return new ResponseEntity(user,HttpStatus.OK);
	}
	@DeleteMapping(value = "deleteuser/{id}")

	 

    public ResponseEntity<User> deleteUser(@PathVariable Integer id) {
        return new ResponseEntity(user, HttpStatus.OK);
    }
}
