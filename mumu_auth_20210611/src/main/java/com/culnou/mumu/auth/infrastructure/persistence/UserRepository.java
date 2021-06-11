package com.culnou.mumu.auth.infrastructure.persistence;

import java.util.List;

import com.culnou.mumu.auth.domain.model.entity.User;
import com.culnou.mumu.auth.domain.model.entity.UserId;

public interface UserRepository {
	
	
	public void saveUser(User user) throws Exception;
	
	public User findUserById(UserId userId) throws Exception;
	
	public List<User> findAllUsers() throws Exception;

}
