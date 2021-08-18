package com.sbh2db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbh2db.model.User;
import com.sbh2db.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getUsers() {
		return userRepository.findAllUser();
	}

	@Override
	public User saveAndUpdate(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteByUserId(int id) {
		userRepository.deleteById(id);

	}
	/*public int deleteByEmpId(int empId) {
		userRepository .deleteById(empId);
        return 1;
    }*/

}
