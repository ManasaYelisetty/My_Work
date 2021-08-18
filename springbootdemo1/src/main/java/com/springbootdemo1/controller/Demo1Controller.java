package com.springbootdemo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

	@RequestMapping(value="one",method=RequestMethod.GET)
	public String sayHello()
	{
		return "Welcome to spring Boot";
	}
}
