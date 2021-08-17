package com.controller;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exception.UserException;
import com.model.User;

@Controller
public class UserController {
	private static final Logger logger = LogManager.getLogger(UserController.class);
@GetMapping(value="/")
	public ModelAndView userPage()
	{
		logger.info("Enter userPage()");
		User user=new User();
		ModelAndView modelAndView=new ModelAndView("login");
		modelAndView.addObject("userModel", user);
		logger.info("user object created");
		return modelAndView;
	}
@PostMapping(value="loginProcess")
public ModelAndView addUser(@ModelAttribute("userModel") User user) throws IOException,UserException
{
	logger.info("Just entered add user()");
	if(user !=null)
	{
		if(user.getUserName().length()<4)
		{
			logger.error("some error message");
			throw new IOException("Enter valid username");//user defined
		}
		if(user.getPassword().length()<4)
		{
			throw new UserException("Please enter valid password");//user defined
		}
	}
	ModelAndView modelAndView=new ModelAndView("success");
	return modelAndView;
}
/*@ExceptionHandler({IOException.class,UserException.class})
	public ModelAndView processException(Exception e)
	{
		ModelAndView modelAndView=new ModelAndView("exceptionPage");
		modelAndView.addObject("reason", "Reason for exception "+ e.getMessage());//404
		return modelAndView;
	}*/
/*@ExceptionHandler(UserException.class)
public ModelAndView processSecondException(Exception e)
{
	ModelAndView modelAndView=new ModelAndView("exceptionPage");
	modelAndView.addObject("reason", "Reason for exception "+ e.getMessage());//404
	return modelAndView;
}*/
}
