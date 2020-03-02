package com.cts.training.pixogram.UserMicroService.model;

import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

public class UserModel {
	
private Integer id;
private String userName;
private String password;
private String email;
private String firstName;
private String lastName;
private LocalDate dob;



public UserModel(String string, long currentTimeMillis) {
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}

}
