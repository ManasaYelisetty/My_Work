package com.inheritance;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contractemployee")
@PrimaryKeyJoinColumn(name="EID")
public class ContractEmployee extends Employee {
private int pay_per_hour;
private int contract_duration;

public ContractEmployee(int id, String name, int pay_per_hour, int contract_duration) {
	super(id, name);
	this.pay_per_hour = pay_per_hour;
	this.contract_duration = contract_duration;
}
public ContractEmployee() {
	
}
public int getPay_per_hour() {
	return pay_per_hour;
}
public void setPay_per_hour(int i) {
	this.pay_per_hour = i;
}
public int getContract_duration() {
	return contract_duration;
}
public void setContract_duration(int i) {
	this.contract_duration = i;
}
@Override
public String toString() {
	return "ContractEmployee [pay_per_hour=" + pay_per_hour + ", contract_duration=" + contract_duration + "]";
}

}
