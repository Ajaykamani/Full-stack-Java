package com.cts.training.pixogram.UserMicroService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.pixogram.UserMicroService.entities.Authorities;
import com.cts.training.pixogram.UserMicroService.repository.AuthoritiesRepository;

@Service
public class AuthoritiesService {
	
	
	@Autowired
	private AuthoritiesRepository authoritiesrepository;
	
	public void saveauthority(Authorities role) {
		this.authoritiesrepository.save(role);
	}

	
	

}
