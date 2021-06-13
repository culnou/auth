package com.culnou.mumu.auth.application;

import com.culnou.mumu.auth.controller.UserResource;
import com.culnou.mumu.auth.domain.model.UserId;


public interface AuthService {
	
	public UserResource signIn(Dto user) throws Exception;
	
	public UserResource findUserById(UserId id) throws Exception;
	
	//単体テスト用。
	public void removeAllUser() throws Exception;

}
