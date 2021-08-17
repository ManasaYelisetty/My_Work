package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyFirstspring {
public static void main(String[] args) {
	/*ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	Student st=context.getBean("st",Student.class);
	System.out.println(st.getId()+" "+st.getName()+" "+st.getAddress().getCity());
	System.out.println(st.getAddress().getId());*/
	/*ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	HelloWorld hello=context.getBean("hello",HelloWorld.class);
	hello.setMessage("Hi Welcome");
	System.out.println(hello.getMessage());
	HelloWorld hello1=context.getBean("hello",HelloWorld.class);
	hello1.setMessage("hii");
	System.out.println(hello1.getMessage());
	*/
	
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	Employee emp=context.getBean("emp",Employee.class);
	emp.display();
	Student st=context.getBean("st",Student.class);
	System.out.println(st);
	
	
	/*Resource resource=new ClassPathResource("Beans.xml ");
	BeanFactory factory=new XmlBeanFactory(resource);
	Employee emp=factory.getBean("emp",Employee.class);
	emp.display();*/
}
}
