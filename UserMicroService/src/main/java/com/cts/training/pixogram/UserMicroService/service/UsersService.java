package com.cts.training.pixogram.UserMicroService.service;

import java.util.List;


import com.cts.training.pixogram.UserMicroService.entities.Users;
import com.cts.training.pixogram.UserMicroService.model.RegisterModel;



public interface UsersService {
	
	List<Users> findAllUsers();
	
	boolean addUsers(Users user);
	boolean updateUsers(Users user);
	boolean deleteUsers(Integer id);

	public Users findUsersById(Integer userId);

	public void saveuser(RegisterModel registermodel);
	
	public void checkUserName(Users user);

	
	

}
