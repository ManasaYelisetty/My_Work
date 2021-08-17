package com.exception;

public class UserException extends Exception{
private String errMessage;

public UserException(String errMessage) {
	super();
	this.errMessage = errMessage;
}

public String getMessage()
{
	return this.errMessage;
}

}
