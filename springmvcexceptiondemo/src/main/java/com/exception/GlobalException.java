package com.exception;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler({IOException.class,UserException.class})
   public ModelAndView processException(Exception exception)
   
   {
	   ModelAndView modelAndView=new ModelAndView("exceptionPage");
		modelAndView.addObject("reason", "Reason for exception "+ exception.getMessage());//404
		return modelAndView;
   }
}
