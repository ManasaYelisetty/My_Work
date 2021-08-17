package com.dao;

import java.util.List;

import com.exception.UserException;
import com.model.User;

public interface UserDao {
	public abstract User getUser();

	public abstract User getUserByName(String userName)  ;
	public abstract User getUserById(Integer userId) ;
	public abstract List<User> getUsers();

	public abstract User addUser(User user);

	public abstract User updateUser(User user);
	public abstract User deleteUser(Integer userId);
}
