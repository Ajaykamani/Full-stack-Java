package com.cts.training.pixogram.UserMicroService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.pixogram.UserMicroService.entities.Users;
import com.cts.training.pixogram.UserMicroService.model.RegisterModel;
import com.cts.training.pixogram.UserMicroService.entities.Authorities;
import com.cts.training.pixogram.UserMicroService.repository.UsersRepository;
import com.cts.training.pixogram.UserMicroService.repository.AuthoritiesRepository;
@Service
public class UserServiceImpl implements UsersService{
	
	
	
	@Autowired
	private UsersRepository userRepository;
	
	
	@Autowired
	private AuthoritiesRepository authoritiesrepository;
	
	

	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

	@Override
	public Users findUsersById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Users> record=this.userRepository.findById(id);
		Users users=new Users();
		if(record.isPresent())
		{
			users=record.get();
		}
		return users;
	}

	@Override
	public boolean addUsers(Users user) {
		// TODO Auto-generated method stub
		return this.addUsers(user);
	}

	@Override
	public boolean updateUsers(Users user) {
		// TODO Auto-generated method stub
		return this.updateUsers(user);
	}

	@Override
	public boolean deleteUsers(Integer id) {
		// TODO Auto-generated method stub
		return this.deleteUsers(id);
	}

	@Override
	public void saveuser(RegisterModel registermodel) {
		// TODO Auto-generated method stub
			Users data = new Users();
			
			data.setUsername(registermodel.getUserName());
			data.setFirstname(registermodel.getFirstName());
			data.setLastname(registermodel.getLastName());
			data.setEmail(registermodel.getEmail());
			data.setDob(registermodel.getDob());
			data.setPassword("{noop}" + registermodel.getPassword());
			data.setEnabled(true);
			this.userRepository.save(data);
			
			// add authority
			Authorities role = new Authorities(registermodel.getUserName(), "ROLE_USER");
			this.authoritiesrepository.save(role);
		
		
	}

	@Override
	public void checkUserName(Users user) {
		// TODO Auto-generated method stub
		
		
		
		
	}
	
	
	
	

}
