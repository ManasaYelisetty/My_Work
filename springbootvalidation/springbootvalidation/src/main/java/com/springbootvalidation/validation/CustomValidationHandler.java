package com.springbootvalidation.validation;

import java.time.LocalDateTime;


import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class CustomValidationHandler extends ResponseEntityExceptionHandler {

	@Override
	@ExceptionHandler(ConstraintViolationException.class)
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
	FieldError fieldError=	ex.getBindingResult().getFieldError();
	String defaultMessage = fieldError.getDefaultMessage();
	CustomError customError=new CustomError(LocalDateTime.now(),defaultMessage,"Please Check");
	return new ResponseEntity<Object>(customError,HttpStatus.BAD_REQUEST);
	}

}
