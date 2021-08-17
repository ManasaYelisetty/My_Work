package com.dao;

import java.util.List;


import com.model.Register;

public interface RegisterDaoIntf {

	void saveRegister(Register register);

	List<Register> getUsers();

	void deleteRegister(int userId);

	

}
