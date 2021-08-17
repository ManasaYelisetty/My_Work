package com.main;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;

public class JPAExample {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo1_persist_xml");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		UserDao dao=new UserDaoImpl(entityManager);
		User user=new User("pushpa");
		Optional<User> savedObject=dao.save(user);
		if(savedObject.isPresent())
		{
			User temp=savedObject.get();
			System.out.println(temp.getName()+" "+temp.getId());
		}
		else
		{
			System.out.println("sorry");
		}

	}

}
