package com.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.validation.UserValidator;

//wire with spring
@Controller
public class AppController {
	@Autowired
	@Qualifier("userValidator")
	private UserValidator userValidator;
	@InitBinder
	private void initBinder(WebDataBinder binder) 
	{
		binder.setValidator(userValidator);
	}
	//request handler
	@RequestMapping(value="one",method=RequestMethod.GET)
public String functionOne()
{
	return "success";//view name --DS--->ViewResolver
}
	@GetMapping(value="/")
	//model interace and modelandview is a class
	public ModelAndView loginform(Locale locale)
	{
		//create an object and send to jsp page
		User user=new User();
		ModelAndView modelAndView=new ModelAndView("login");
		modelAndView.addObject("userPojo", user);
		return modelAndView;
	}
	
	//@RequestMapping(value="loginProcess",method=RequestMethod.POST)
	@PostMapping(value="loginProcess")
	public ModelAndView functionTwo(@Valid @ModelAttribute("userPojo") User user,BindingResult bindingResult)//accept ui in controller
	{
		ModelAndView modelAndView=null;
		if(bindingResult.hasErrors())
		{
			modelAndView=new ModelAndView("login");
			//modelAndView.setViewName("login");
		}
		else
		{
			modelAndView=new ModelAndView("loginsuccess");
			modelAndView.addObject("userPojo", user);
		}
		return modelAndView;//view name --DS--->ViewResolver
	}
}
