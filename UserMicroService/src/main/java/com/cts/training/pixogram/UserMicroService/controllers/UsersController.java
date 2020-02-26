package com.cts.training.pixogram.UserMicroService.controllers;


import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cts.training.pixogram.UserMicroService.entities.Users;

import com.cts.training.pixogram.UserMicroService.service.UsersService;



@RestController
public class UsersController {
	

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// dependency
	@Autowired
	private UsersService userservice;
	
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
	
	// @RequestMapping(value =  "/students", method = RequestMethod.POST)
	@PostMapping("/users") // POST HTTP VERB
	public ResponseEntity<Users> save(@RequestBody Users user) {
		this.userservice.addUsers(user);
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
	
}

