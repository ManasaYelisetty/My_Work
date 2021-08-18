package com.sbh2db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sbh2db.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
	@Query("from User")
	List<User> findAllUser();
}
