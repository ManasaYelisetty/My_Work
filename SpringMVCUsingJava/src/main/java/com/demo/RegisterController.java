package com.demo;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.model.Register;
import com.service.RegisterServiceIntf;

@RestController
public class RegisterController{
	 @Autowired
	    RegisterServiceIntf service;
	@RequestMapping("/register")
	public ModelAndView registerPage(@ModelAttribute("register") Register register)
	{
		return new ModelAndView("register");//jsp
	}
	@RequestMapping("/saveRegister")
	public ModelAndView saveRegister(@Validated @ModelAttribute("register") Register register, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("register");
		}
		else
		{
			service.saveRegister(register);
	        return new ModelAndView("redirect:/fetchUsers");
			// return new ModelAndView("success");
		}
	}

    @RequestMapping("/fetchUsers")
    
    public ModelAndView getUsers()
    {
    	List<Register>ls=service.getUsers();
        return new ModelAndView("success","listOfUsers",ls);
    }
	}

	

	