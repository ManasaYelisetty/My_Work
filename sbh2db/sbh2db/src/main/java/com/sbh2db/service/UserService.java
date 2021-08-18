package com.sbh2db.service;

import java.util.List;

import com.sbh2db.model.User;

public interface UserService {

	public abstract List<User>  getUsers();
	
	public abstract User saveAndUpdate(User user);
	
	public abstract void deleteByUserId(int id);
}
