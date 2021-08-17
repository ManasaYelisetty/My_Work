package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*@Entity
@Table(name="department")
@NamedQueries(
		{
@NamedQuery(name="findByDepartmentByName",query="from Department d where d.deptname=:name)")			
		}
		)*/
/*@Entity
@Table(name="department")
@NamedNativeQueries(
		{
			@NamedNativeQuery(name="findDepartmentByName",query="select * from department  where deptname=:name",resultClass=Department.class)		
		}
		)*/
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String deptname;
private String location;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Department(int id, String deptname, String location) {
	super();
	this.id = id;
	this.deptname = deptname;
	this.location = location;
}
public Department()
{
	
}
@Override
public String toString() {
	return "Department [id=" + id + ", deptname=" + deptname + ", location=" + location + "]";
}

}
