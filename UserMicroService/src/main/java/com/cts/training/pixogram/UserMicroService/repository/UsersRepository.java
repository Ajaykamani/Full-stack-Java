package com.cts.training.pixogram.UserMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.pixogram.UserMicroService.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
