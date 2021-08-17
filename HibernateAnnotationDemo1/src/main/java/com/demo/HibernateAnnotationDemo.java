package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class HibernateAnnotationDemo {
public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory sfg=config.buildSessionFactory(); 
	Session session=sfg.openSession();
	Transaction tx=session.beginTransaction();
	Student std=new Student(1,"Manasa",25);
	session.save(std);
	tx.commit();
}
}
