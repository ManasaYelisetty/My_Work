package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Register;
import com.service.RegisterServiceIntf;

@RestController
public class RegisterController
{
	@Autowired
	RegisterServiceIntf service;
	//@RequestMapping(value="saveRegister",method=RequestMethod.POST)
	@PostMapping("saveRegister")
	public void SaveRegister(@RequestBody Register register )
	{
		service.saveRegister(register);
	}
	@DeleteMapping("deleteRegister/{userId}")
	public void deleteRegister(@PathVariable("userId") int userId)
	{
	service.deleteRegister(userId);
	}
	//@RequestMapping(value="fetchUsers",method=RequestMethod.GET)
	@GetMapping("fetchUsers")
	public List<Register> getUsers()
	{
		List<Register>ls=service.getUsers();
		return ls;
	}
	
}	