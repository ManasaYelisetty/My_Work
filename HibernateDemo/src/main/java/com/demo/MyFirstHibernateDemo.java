package com.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;


public class MyFirstHibernateDemo {
public static void main(String[] args) {
	//Employee emp=new Employee(1,"Manasa",21);
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory sfg=config.buildSessionFactory(); 
	Session session=sfg.openSession();
	//Employee emp=new Employee(3,"manu",35);
	/*Transaction tx=session.beginTransaction();
	//------------insert---------------
	//session.save(emp);
	//----------delete-----------------
	Employee emp=(Employee) session.get(Employee.class, 1);
	if(emp!=null) {
		session.delete(emp);
	System.out.println("Deleted Successfully");
	}
	else {
		System.out.println("no such employee");
	}
	//------------update-----------------
	Employee emp=(Employee) session.get(Employee.class, 1);
	if(emp!=null) {
		emp.setName("revathi");
		session.update(emp);
	System.out.println("updated Successfully");
	}
	else {
		System.out.println("no such employee");
	}
	tx.commit();*/
	/*Query query=session.createQuery("select e.name from Employee e");
	List<String> ls=query.list();
	ls.forEach(empName->System.out.println(empName));*/
	//------to fetch only id can use Object in place of integer
	/*Query query=session.createQuery("select e.id from Employee e");
	List<Integer> ls=query.list();
	ls.forEach(empId->System.out.println(empId));*/
	//-----------using scanner--------
	/*Scanner scanner=new Scanner(System.in);
	System.out.println("Enter id");
	int id=Integer.parseInt(scanner.nextLine());
	//namedparameter
	Query query=session.createQuery("from Employee e where e.id=:emp");
	query.setParameter("emp", id);
	List<Object> ls=query.list();
	ls.forEach(empId->System.out.println(empId));*/
	//------native sql query
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter id");
	int id=Integer.parseInt(scanner.nextLine());
	//namedparameter
	/*Query query=session.createSQLQuery("select * from tblemp where id=:emp").addEntity(Employee.class);
	query.setParameter("emp", id);
	List<Object> ls=query.list();
	ls.forEach(empId->System.out.println(empId));
	Employee emp1=(Employee)query.uniqueResult();//uniqueresult returns only one row
	
	System.out.println(emp1.getAge());*/
	
	
	/*Criteria criteria=session.createCriteria(Employee.class);//select * from tblemp
	List<Employee> ls=criteria.list();
	ls.forEach(emp->System.out.println(emp));
	*/
	Criteria criteria=session.createCriteria(Employee.class);//select * from tblemp
	criteria.add(Restrictions.gt("id",1));//Restrictions
	List<Employee> ls=criteria.list();
	ls.forEach(emp->System.out.println(emp));
	/*criteria.setProjection(Projections.property("name"));//select name from tblemp
	List<String> ls=criteria.list();//Projections
	ls.forEach(emp->System.out.println(emp));*/
	
}
}
