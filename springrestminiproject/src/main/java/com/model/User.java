package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component  //part of Spring
@Entity
@Table(name="user_rest")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //PK is auto generate
	@Column(length=5)
	private Integer userId;
	@Column(length=25)
	private String userName;
	@Column(length=25)
	private String password;

	public User() {
		super();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}