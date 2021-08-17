package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User getUser() {
		
		Session session=sessionFactory.openSession();
		String hqlread="from User";   //ORM==object pojo
		List<User> users=session.createQuery(hqlread).list();
		return users.get(0);
		
	}

	@Override
	public User getUserByName(String userName) {
		/*Session session=sessionFactory.openSession();
		String hqlread="from User as u where u.userName=:alias";
		Query query=session.createQuery(hqlread);*/
		Session    session=sessionFactory.openSession();
        String query="from User u where u.userName='"+userName+"'";
        List<User> users=session.createQuery(query).list();
            return users.get(0);
		
		
		
		
	}

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
