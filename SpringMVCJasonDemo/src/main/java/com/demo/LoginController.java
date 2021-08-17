package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/Login")
	public ModelAndView registerPage() {
		return new ModelAndView("login");//name of jsp
	}
}
