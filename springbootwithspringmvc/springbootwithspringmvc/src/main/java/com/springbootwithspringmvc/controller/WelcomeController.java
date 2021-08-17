package com.springbootwithspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController {
	@GetMapping(value="/one")
		public String sayHello()
		{
			return "success";
		}
}
