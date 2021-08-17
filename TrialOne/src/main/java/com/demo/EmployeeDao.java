package com.demo;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	private JdbcTemplate template; 
/*public void insertEmployee(Employee e) {
	String insertQuery="insert into employee values("+e.getId()+",'"+e.getName()+"')";
	template.update(insertQuery);
}*/
/*public void updateEmployee(Employee e) {
	String updateQuery="update table employee set name='"+e.getName()+"' where id="+e.getId()+;
	template.update(updateQuery);
}*/
	public List<Employee> fetchEmployees(){
		String sql="select * from employee";
		List<Employee> ls=template.query(sql, new EmployeeRowMapper());
		return ls;
	}
}