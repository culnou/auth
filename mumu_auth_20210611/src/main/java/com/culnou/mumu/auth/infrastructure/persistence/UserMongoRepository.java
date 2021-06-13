package com.culnou.mumu.auth.infrastructure.persistence;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.culnou.mumu.auth.domain.model.User;
import com.culnou.mumu.auth.domain.model.UserId;
import com.culnou.mumu.auth.domain.model.UserRepository;
@Service("userMongoRepository")
@Transactional
public class UserMongoRepository implements UserRepository {

	@Autowired
	private UserJpaMongoRepository userRepository;
	

	@Override
	public User findUserById(UserId userId) throws Exception {
		// TODO Auto-generated method stub
		Optional<User> readUser = userRepository.findById(userId.getId());
		if (readUser.isPresent()){
			User user = readUser.get();
			return user;
		}else {
			return null;
		}
		
	}

	@Override
	public List<User> findAllUsers() throws Exception {
		// TODO Auto-generated method stub
		List<User> readUsers = userRepository.findAll();
		return readUsers;
	}

	

	@Override
	public void saveUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}

	@Override
	public void removeUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userRepository.delete(user);
		
	}

	@Override
	public void removeAll() throws Exception {
		// TODO Auto-generated method stub
		userRepository.deleteAll();
		
	}

}
