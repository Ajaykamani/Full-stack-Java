package com.cts.training.pixogram.UserMicroService.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.pixogram.UserMicroService.model.UserModel;



@RestController
@CrossOrigin("http://localhost:4200")
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// testing end-point
	
	@GetMapping("/login")
	public ResponseEntity<String> login() {
		// if called then credentials are valid
		logger.info("Logged In...");
		
		//UserModel data = new UserModel("Welcome!!!", System.currentTimeMillis());
		
		//ResponseEntity<UserModel> response = 
		//			new ResponseEntity<UserModel>(data, HttpStatus.OK);
		String data = "welcome!!";
		ResponseEntity<String> response  = new ResponseEntity<String>(data,HttpStatus.OK);
		
		return response;
	}
		
	
}