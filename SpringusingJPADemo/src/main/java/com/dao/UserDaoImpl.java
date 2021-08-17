  package com.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.model.User;

public class UserDaoImpl implements UserDao{
	private EntityManager entityManager;
	
	public UserDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public Optional<User> save(User user) {
		entityManager.getTransaction().begin();
		entityManager.persist(user);//transaction
		entityManager.getTransaction().commit();
		return Optional.of(user);//avoid null pointer exception
	}

	public Optional<User> findById(Integer id) {
		User user=entityManager.find(User.class,id);
		
		return (Optional<User>) (user!=null?Optional.of(user):Optional.empty());
	}

	public List<User> findAll() {
		//hql query based on java objects
		return entityManager.createQuery("from User").getResultList();
	}

	public Optional<User> update(User user) {
		entityManager.persist(user);//
		entityManager.getTransaction().commit();
		
		return Optional.of(user);
	}

	public Integer deleteById(Integer id) {
		entityManager.getTransaction().begin();
		User user=entityManager.find(User.class,id);
		entityManager.remove(user);//instead of delete==remove
		entityManager.getTransaction().commit();
		return id;
	}

}
