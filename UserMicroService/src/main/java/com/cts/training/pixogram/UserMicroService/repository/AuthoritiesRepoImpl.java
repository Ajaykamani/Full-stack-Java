package com.cts.training.pixogram.UserMicroService.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class AuthoritiesRepoImpl implements Authorities{

	@PersistenceContext
	private EntityManager em;

	
	@Override
	public void save(Authorities auth) {
		// TODO Auto-generated method stub
		this.em.merge(auth);
		
	}

}
