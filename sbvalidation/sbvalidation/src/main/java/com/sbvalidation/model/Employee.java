package com.sbvalidation.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

	private Integer empNo;
	@NotNull
	@Size(min = 3, message = "Name should hace min 3 characters")
	private String firstName;
	@NotEmpty(message = "Email is required")
	@Email
	private String email;

	@NotEmpty(message = "Phone number is required")
	@Pattern(regexp = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message = "Mobile number is invalid")
	private String mobilePhone;

	@Past
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthday;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Employee() {
		super();
	}

	public Employee(Integer empNo,
			@NotNull @Size(min = 3, message = "Name should have min 3 characters") String firstName,
			@NotEmpty(message = "Email is required") @Email String email,
			@NotEmpty(message = "Phone number is required") @Pattern(regexp = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message = "Mobile number is invalid") String mobilePhone,
			@Past LocalDate birthday) {
		super();
		this.empNo = empNo;
		this.firstName = firstName;
		this.email = email;
		this.mobilePhone = mobilePhone;
		this.birthday = birthday;
	}

}
