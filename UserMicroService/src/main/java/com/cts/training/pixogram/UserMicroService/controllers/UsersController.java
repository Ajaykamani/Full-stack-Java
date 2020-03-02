package com.cts.training.pixogram.UserMicroService.controllers;


import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cts.training.pixogram.UserMicroService.entities.Users;
import com.cts.training.pixogram.UserMicroService.exception.UserErrorResponse;
import com.cts.training.pixogram.UserMicroService.exception.UserNotFoundException;
import com.cts.training.pixogram.UserMicroService.service.StorageService;
import com.cts.training.pixogram.UserMicroService.service.UsersService;



@RestController
public class UsersController {
	

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// dependency
	@Autowired
	private UsersService userservice;
	
	@Autowired
	private StorageService storageService;
	
	// @RequestMapping(value =  "/students", method = {RequestMethod.GET, RequestMethod.PUT} )
	@GetMapping("/users") // GET HTTP VERB
	public ResponseEntity<List<Users>> exposeAll() {
		
		List<Users> user = this.userservice.findAllUsers();
		ResponseEntity<List<Users>> response = 
								new ResponseEntity<List<Users>>(user, HttpStatus.OK);
		
		
		return response;
	}
	
	// {<data variable>}
	@GetMapping("/users/{userId}") // GET HTTP VERB
	public ResponseEntity<Users> getById(@PathVariable Integer userId) {
		
		Users user =  this.userservice.findUsersById(userId);
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(user, HttpStatus.OK);

		return response;
	}
	
	// @RequestMapping(value =  "/users", method = RequestMethod.POST)
	@PostMapping("/users") // POST HTTP VERB
	public ResponseEntity<Users> save(@RequestParam("file") MultipartFile file,
										@RequestParam("Id") Long Id,@RequestParam("url") String url,@RequestParam("username") String username,@RequestParam("password") String password,
										@RequestParam("repassword") String repassword,@RequestParam("email")String email){
		
		Users user=new Users(null, username,password,repassword,email,url, null, email, null, null, null);
		
		if(!this.userservice.addUsers(user))
			throw new RuntimeException("Could not add new record!!!");
		
		// string file in static folder
		this.storageService.store(file);
		
		logger.info("Media is uploaded successfully " + file.getOriginalFilename() + "!");
		
		
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(user, HttpStatus.OK);

		return response;
	}
	
	
	@PutMapping("/users")
	public ResponseEntity<Users> saveUpdate(@RequestBody Users user) {
		this.userservice.updateUsers(user);
			
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(user, HttpStatus.OK);

		return response;
	}
	
	
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<Users> delete(@PathVariable Integer userId) {
		
		Users user = this.userservice.findUsersById(userId);
		this.userservice.deleteUsers(userId);
		
		ResponseEntity<Users> response = 
				new ResponseEntity<Users>(user, HttpStatus.OK);

		return response;
	}
	
	@ExceptionHandler  // ~catch
	public ResponseEntity<UserErrorResponse> productNotFoundHandler(UserNotFoundException ex) {
		// create error object
		UserErrorResponse error = new UserErrorResponse(ex.getMessage(), 
															  HttpStatus.NOT_FOUND.value(), 
															  System.currentTimeMillis());
		ResponseEntity<UserErrorResponse> response =
										new ResponseEntity<UserErrorResponse>(error, HttpStatus.NOT_FOUND);
		
		return response;
	}
	
	@ExceptionHandler  // ~catch
	public ResponseEntity<UserErrorResponse> productOperationErrorHAndler(Exception ex) {
		// create error object
		UserErrorResponse error = new UserErrorResponse(ex.getMessage(), 
															  HttpStatus.BAD_REQUEST.value(), 
															  System.currentTimeMillis());
		ResponseEntity<UserErrorResponse> response =
										new ResponseEntity<UserErrorResponse>(error, HttpStatus.NOT_FOUND);
		logger.error("Exception :" + error);
		
		return response;
	}
	
	
	
}

