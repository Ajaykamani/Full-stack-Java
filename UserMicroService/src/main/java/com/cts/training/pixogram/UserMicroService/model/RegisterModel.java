package com.cts.training.pixogram.UserMicroService.model;

import java.time.LocalDate;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterModel {
	
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDate dob;
	private MultipartFile file;
	
	
	
}
