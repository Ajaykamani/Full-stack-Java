package com.cts.training.pixogram.UserMicroService.controllers;


import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.pixogram.UserMicroService.entities.Users;
import com.cts.training.pixogram.UserMicroService.model.RegisterModel;
import com.cts.training.pixogram.UserMicroService.model.ResponseData;
import com.cts.training.pixogram.UserMicroService.model.UserModel;
import com.cts.training.pixogram.UserMicroService.repository.UsersRepository;
import com.cts.training.pixogram.UserMicroService.service.UsersService;




@RestController
@CrossOrigin("http://localhost:4200")
public class LoginController {
	
	@Autowired
	private UsersService userService;
	@Autowired
	private UsersRepository usersRepository;


	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// testing end-point
	
	@GetMapping("/login")
	public ResponseEntity<ResponseData> login(HttpServletRequest request) {
		// if called then credentials are valid
		
		String authorization = request.getHeader("Authorization");
		String[] values = null;
		
		if (authorization != null && authorization.startsWith("Basic")) {
		    // Authorization: Basic base64credentials
		    String base64Credentials = authorization.substring("Basic".length()).trim();
		    byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
		    String credentials = new String(credDecoded, StandardCharsets.UTF_8);
		    // credentials = username:password
		    values = credentials.split(":", 2);
		}
		
		
		logger.info("Logged In...");
		logger.info(values[0]);
		logger.info(values[1]);
        
        Users user = this.usersRepository.findByUsername(values[0]).get(0);
        logger.info("User : " + user);
        // add any additional information like firstname, lastname, profilepic etc
		ResponseData data = new ResponseData("Welcome!!!", System.currentTimeMillis(), user.getId());

		ResponseEntity<ResponseData> response = 
					new ResponseEntity<ResponseData>(data, HttpStatus.OK);
		
		return response;
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<ResponseData> register(@RequestBody RegisterModel registermodel) {
		// if called then credentials are valid
		logger.info("Registration...");
		
		this.userService.saveuser(registermodel);
		
		ResponseData data = new ResponseData("Welcome!!!", System.currentTimeMillis());

		ResponseEntity<ResponseData> response = 

					new ResponseEntity<ResponseData>(data, HttpStatus.OK);
		return response;

}
		
	
}