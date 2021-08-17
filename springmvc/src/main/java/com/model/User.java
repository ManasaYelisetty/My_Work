package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

//Model  ==bean validation=>fails ?? go to page from where data came
public class User {
	
private int userId;
//@NotEmpty( message="user defied messages")
//@Size(min=2,max=7)
//@Min(value=2,message="please give min 2 data")
//@Max(value=5,message="donot exceed 5 chataters")
private String userName;
//@NotEmpty(message="password is mandatory")

private String password;
public User() {
	super();
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
