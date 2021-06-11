package com.culnou.mumu.auth.domain.model.repository;

import java.util.List;

import com.culnou.mumu.auth.domain.model.entity.User;
import com.culnou.mumu.auth.domain.model.entity.UserId;
import com.culnou.mumu.auth.infrastructure.persistence.UserRepository;

public class UserMongoRepository implements UserRepository {

	
	

	@Override
	public User findUserById(UserId userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserId createUserId(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
