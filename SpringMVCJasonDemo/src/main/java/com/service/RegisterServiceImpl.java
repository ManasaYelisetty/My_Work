package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.RegisterDaoIntf;
import com.model.Register;
@Service
@Transactional
public class RegisterServiceImpl implements RegisterServiceIntf{
	@Autowired
	RegisterDaoIntf dao;
	public void saveRegister(Register register) {
		dao.saveRegister(register);
		
	}
	public List<Register> getUsers()
	{
		List<Register> ls=dao.getUsers();
		return ls;
	}
	public void deleteRegister(int userId) {
		dao.deleteRegister(userId);
		
	}

}
