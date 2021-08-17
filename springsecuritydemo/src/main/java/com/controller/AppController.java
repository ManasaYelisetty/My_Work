package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@GetMapping(value = "/")
    public ModelAndView visitHome()
    {
		return new ModelAndView("index");
    }
	@GetMapping(value = "/admin")
    public ModelAndView visitAdmin()
    {
		ModelAndView model = new ModelAndView("admin");
        model.addObject("title", "Admministrator Control Panel");
        model.addObject("message", "This page demonstrates how to use Spring security.");


        return model;
    }
    
}
