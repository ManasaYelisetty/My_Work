package com.model;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

//import org.hibernate.validator.constraints.NotBlank;
//import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="registrationform")
public class Register {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
		@NotEmpty(message="UserName should not be empty")
		@Column(name="username",nullable=false)
private String username;
		@NotEmpty(message="Password should not be empty")
private String password;
		@NotEmpty(message="languages should not be empty")
private String languages;
		@NotEmpty(message="gender should not be empty")
private String gender;
		@NotEmpty(message="country should not be empty")
private String country;
		@NotNull(message="dateOfBirth should not be empty")
		
		@DateTimeFormat(pattern = "yyyy-MM-dd")
	    //@NotNull
	     // @Temporal(TemporalType.DATE)
		//@NotNull
	     // @Temporal(TemporalType.TIMESTAMP)
	   
private Date dateOfBirth;
		
public int getId() {
			return id;
		}
		public void setUserid(int id) {
			this.id = id;
		}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getLanguages() {
	return languages;
}
public void setLanguages(String languages) {
	this.languages = languages;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}





}
