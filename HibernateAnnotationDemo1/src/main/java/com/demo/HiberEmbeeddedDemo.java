package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Person;


public class HiberEmbeeddedDemo {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sfg=config.buildSessionFactory(); 
		Session session=sfg.openSession();
		Person person=new Person();
		person.setFirstName("Manasa");
		person.setMiddleName("Manu");
		person.setLastName("Yelisetty");
		
		Address address=new Address();
		address.setCity("Surrey");
		address.setState("Hyderabad");
		address.setCountry("India");
		person.setAddress(address);
		session.save(person);
		Transaction tx=session.beginTransaction();
		tx.commit();
		

	}

}
