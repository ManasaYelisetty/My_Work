package com.inheritance;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regularemployee")
@PrimaryKeyJoinColumn(name="EID")
public class RegularEmployee extends Employee {
private int bonus;
private int salary;
public RegularEmployee(int bonus, int salary) {
	super();
	this.bonus = bonus;
	this.salary = salary;
}
public RegularEmployee()
{
	
}
public int getBonus() {
	return bonus;
}
public void setBonus(int i) {
	this.bonus = i;
}
public int getSalary() {
	return salary;
}
public void setSalary(int i) {
	this.salary = i;
}
@Override
public String toString() {
	return "RegularEmployee [bonus=" + bonus + ", salary=" + salary + "]";
}

}
