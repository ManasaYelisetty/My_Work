package com.springbootwiththymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbootwiththymeleaf.model.User;

@Controller
public class HelloController {
	@GetMapping(value="/")
		public String index()
		{
			return "index";
		}
	@PostMapping(value="save")
	public ModelAndView save(@ModelAttribute User user) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("happy");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
