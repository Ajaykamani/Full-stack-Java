package com.cts.training.pixogram.UserMicroService.service;

import java.util.List;


import com.cts.training.pixogram.UserMicroService.entities.Users;



public interface UsersService {
	
	List<Users> findAllUsers();
	
	boolean addUsers(Users user);
	boolean updateUsers(Users user);
	boolean deleteUsers(Integer id);

	Users findUsersById(Integer userId);

	
	

}
