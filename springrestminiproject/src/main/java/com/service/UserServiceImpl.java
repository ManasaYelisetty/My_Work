package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.exception.UserException;
import com.model.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserException userException;
	@Override
	@Transactional    
	public User getUser() {
		
		return userDao.getUser();
	}

	@Override
	@Transactional 
	public User getUserByName(String userName) throws UserException {
	
		return userDao.getUserByName(userName);
	}

	@Override
	public User getUserById(Integer userId) throws UserException {
		
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
	public User deleteUser(Integer userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
