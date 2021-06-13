package com.culnou.mumu.auth.infrastructure.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.culnou.mumu.auth.application.AuthService;
import com.culnou.mumu.auth.application.Dto;
import com.culnou.mumu.auth.controller.UserResource;
import com.culnou.mumu.auth.domain.model.User;
import com.culnou.mumu.auth.domain.model.UserId;
import com.culnou.mumu.auth.domain.model.UserRepository;
@Service("authRestService")
@Transactional
public class AuthRestService implements AuthService {
	
	@Qualifier("userMongoRepository")
	@Autowired
	private UserRepository userRepository;

	@Override
	public void signIn(Dto dto) throws Exception {
		// TODO Auto-generated method stub
		UserResource userResource = (UserResource)dto;
		User user = new User(userResource.getId(), userResource.getName(), userResource.getDescription(), userResource.isSignIn(), userResource.getProvider(), userResource.getFullName(), userResource.getEmail(), userResource.getAuthState());
		userRepository.saveUser(user);
		

	}

	@Override
	public UserResource findUserById(UserId id) throws Exception {
		// TODO Auto-generated method stub
		User user = userRepository.findUserById(id);
		UserResource userResource = new UserResource(user.getId(), user.getName(), user.getDescription(), user.isSignIn(), user.getProvider(), user.getFullName(), user.getEmail(), user.getAuthState());
		return userResource;
	}

	@Override
	public void removeAllUser() throws Exception {
		// TODO Auto-generated method stub
		userRepository.removeAll();
		
	}

}
