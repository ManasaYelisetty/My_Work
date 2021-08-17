package com.service;

import java.util.List;


import com.model.Register;

public interface RegisterServiceIntf {

	public void saveRegister(Register register);

	public List<Register> getUsers();

}
