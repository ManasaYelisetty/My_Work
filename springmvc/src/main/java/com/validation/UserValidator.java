package com.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.User;

public class UserValidator implements Validator {

	public boolean supports(Class arg0) {
		
		return arg0.equals(User.class);
	}

	public void validate(Object arg0, Errors arg1) {
		
		ValidationUtils.rejectIfEmpty(arg1,"userName","errorCode.userName");
		ValidationUtils.rejectIfEmpty(arg1,"password","errorCode.password");
	}

}
