package com.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceDemo {

	public static void main(String[] args) {
		Configuration config = new Configuration();
	    config.configure("hibernate.cfg.xml");
	    SessionFactory sf = config.buildSessionFactory();
	    Session session = sf.openSession();
	    Employee emp=new Employee();
	    emp.setName("Gourav");
	    RegularEmployee regemp=new RegularEmployee();
	    regemp.setName("manasa");
	    regemp.setSalary(444);
	    regemp.setBonus(2222);
	    ContractEmployee conemp=new ContractEmployee();
	    conemp.setName("Manu");
	    conemp.setContract_duration(3);
	    conemp.setPay_per_hour(23);
	    session.save(emp);
	    session.save(regemp);
	    session.save(conemp);
	    Transaction tx=session.beginTransaction();
		tx.commit();
	}

}
