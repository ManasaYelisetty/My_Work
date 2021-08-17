package com.dao;

import java.util.List;
import java.util.Optional;

import com.model.User;

public interface UserDao {
	public abstract Optional<User> save(User user);//c

	public abstract Optional<User> findById(Integer id);//r

	public abstract List<User> findAll();//r

	public abstract Optional<User> update(User user);

	public abstract Integer deleteById(Integer id);
}
