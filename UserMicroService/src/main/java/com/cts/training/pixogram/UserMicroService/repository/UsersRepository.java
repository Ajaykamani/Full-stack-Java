package com.cts.training.pixogram.UserMicroService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.pixogram.UserMicroService.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

	
	List<Users> findByUsername(String username);

	
}
