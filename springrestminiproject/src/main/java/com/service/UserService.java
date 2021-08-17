package com.service;

import java.util.List;

import com.exception.UserException;
import com.model.User;

public interface UserService {
public abstract User getUser();

public abstract User getUserByName(String userName) throws UserException ;
public abstract User getUserById(Integer userId) throws UserException ;
public abstract List<User> getUsers();

public abstract User addUser(User user);

public abstract User updateUser(User user);
public abstract User deleteUser(Integer userId) throws UserException;

}
