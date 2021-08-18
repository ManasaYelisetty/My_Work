package com.sbwithgit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sbwithgit.model.User;
/**
 * 
 * @author y.manasa
 *
 */
@RestController
public class UserController {
	@GetMapping(value="/emp")//master
	public User getEmployee()
	{
		return new User(10,"Manasa","manu");
	}
	
	@GetMapping(value="/search/{id}")//developer 1
	public User getUserById(@PathVariable("id") int userId)
	{
		User user=null;
		if(userId==10)
		{
			user=new User(10,"Hello","manu");
		}
		if(userId==20)
		{
			user=new User(20,"Lunch","Break");
		}
		return user;
	}
	@GetMapping(value="/list")//developer 1
	public List<User> getUsers()
	{
		
			User user1=new User(10,"Hello","manu");
		User user2=new User(20,"Lunch","Break");
		User user3=new User(30,"Tea","Break");
		List<User> users= new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		return users;
	}
}
