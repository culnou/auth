package com.culnou.mumu.auth.domain.model;


import java.util.List;

public interface UserRepository {
	
	
	
	public void saveUser(User user) throws Exception;
	
	public User findUserById(UserId userId) throws Exception;
	
	public List<User> findAllUsers() throws Exception;
	
	public void removeUser(User user) throws Exception;
	
	public void removeAll() throws Exception;

}
