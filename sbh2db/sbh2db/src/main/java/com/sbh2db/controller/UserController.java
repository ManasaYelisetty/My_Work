package com.sbh2db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbh2db.model.User;
import com.sbh2db.service.UserService;

@RestController
public class UserController {
@Autowired

private UserService userService;

@GetMapping(value="/")
public List<User> allUsers()
{
	return userService.getUsers();
}

@PostMapping(value="create")
public User saveUser(User user)
{
	return userService.saveAndUpdate(user);
}
@DeleteMapping(value="/delete/{param}")
public void deleteUser(@PathVariable("param") int id)
{
	userService.deleteByUserId(id);
}
}
