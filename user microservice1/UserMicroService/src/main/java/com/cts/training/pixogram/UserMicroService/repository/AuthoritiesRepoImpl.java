package com.cts.training.pixogram.UserMicroService.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cts.training.pixogram.UserMicroService.entities.Authorities;

@Repository
@Transactional
public class AuthoritiesRepoImpl implements AuthoritiesRepository{

	@PersistenceContext
	private EntityManager em;

	
	@Override
	public void save(Authorities auth) {
		// TODO Auto-generated method stub
		this.em.persist(auth);
		
	}

}
