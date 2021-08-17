package com.demo;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class LifeCycleDemo {
	@PostConstruct
	public void init() {
		System.out.println("Init method");
	}

private String message;


public String getMessage() {
	return message;
}


public void setMessage(String message) {
	this.message = message;
}

@PreDestroy
public void destroy() {
	System.out.println("destroy");
}
}
