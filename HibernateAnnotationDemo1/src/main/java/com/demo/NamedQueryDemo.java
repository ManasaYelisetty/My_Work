package com.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Department;

public class NamedQueryDemo {
public static void main(String[] args) {
	
	Configuration config = new Configuration();
    config.configure("hibernate.cfg.xml");
    SessionFactory sf = config.buildSessionFactory();
    Session session = sf.openSession();
    Department dept=new Department(1,"CSE","jsr");
    session.save(dept);
    Query query=session.getNamedQuery("findDepartmentByName");
    query.setParameter("name","CSE");
    List<Department> ls=query.list();
    ls.forEach(dept1->System.out.println(dept1));
    
	//main same for named and native
	
}

}

