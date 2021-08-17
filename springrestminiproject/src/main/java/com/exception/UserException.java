package com.exception;

import org.springframework.stereotype.Component;

@Component
public class UserException extends Exception{
	private String errorMessage;

	public UserException() {
		super();
	}

	public UserException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String getMessage() {
		
		return this.errorMessage;
	}
	
}
