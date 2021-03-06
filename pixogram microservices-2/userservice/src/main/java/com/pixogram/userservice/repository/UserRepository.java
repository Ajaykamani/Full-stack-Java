package com.pixogram.userservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixogram.userservice.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByuserName(String username);
	List<User> findByUserNameContaining(String username);
}
