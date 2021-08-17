package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Register;

@Repository
public class RegisterDaoImpl implements RegisterDaoIntf{
//connection using hibernate
	@Autowired
	SessionFactory sessionFactory;
	//insert
	public void saveRegister(Register register) {
		sessionFactory.openSession().save(register);
		
	}
	//fetch
	public List<Register> getUsers()
	{
		List<Register> ls=sessionFactory.openSession().createQuery("from Register").list();
		return ls;
	}
	/*//update
	public void saveUpdateRegister(Register register)
	{
		sessionFactory.openSession().saveUpdate()
	}*/
	public void deleteRegister(int userId)
	{
		/*Register user=(Register) sessionFactory.openSession().get(Register.class, userId);
		sessionFactory.openSession().delete(user);*/
		Query query=sessionFactory.openSession().createSQLQuery("delete from register where userId=:userId");
		query.setParameter("userId", userId);
		query.executeUpdate();
	}
/*@Autowired
	JdbcTemplate jdbcTemplate;
//-------using gettime------
	public void saveRegister(Register register) {
		//register.getDateOfBirth().getTime();
		java.sql.Date sqlDate=new java.sql.Date(register.getDateOfBirth().getTime());
		jdbcTemplate.update("insert into register values('"+register.getUsername()+"','"+register.getPassword()+"','"+register.getLanguages()+"','"+register.getGender()+"','"+register.getCountry()+"','"+sqlDate+"')");
		// jdbcTemplate.update("insert into register values('"+register.getUsername()+"','"+register.getPassword()+"','"+register.getLanguages()+"','"+register.getGender()+"','"+sqlDate+"')");
	}
public void saveRegister(Register register) {
	//register.getDateOfBirth().getTime();
	//java.sql.Date sqlDate=new java.sql.Date(register.getDateOfBirth().getTime());
	jdbcTemplate.update("insert into register values('"+register.getUsername()+"','"+register.getPassword()+"','"+register.getLanguages()+"','"+register.getGender()+"','"+register.getCountry()+"','"+register.getDateOfBirth()+"')");
	
}*/
	
	
}
