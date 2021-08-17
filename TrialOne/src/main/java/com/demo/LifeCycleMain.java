package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		LifeCycleDemo lcd=context.getBean("lifecycle",LifeCycleDemo.class);
		System.out.println(lcd.getMessage());
		context.registerShutdownHook();
		//context.close();closes all connection immediately 
		//register shutdown closes only when jvm shut downs
	}

}
