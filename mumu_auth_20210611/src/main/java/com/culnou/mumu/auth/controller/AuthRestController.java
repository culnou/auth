package com.culnou.mumu.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.culnou.mumu.auth.application.AuthService;

@RestController
public class AuthRestController {
	
	@Qualifier("authRestService")
	@Autowired
	private AuthService authService;
	
	@PostMapping("/users")
	public void signIn(@RequestBody UserResource user) throws Exception{
		this.authService.signIn(user);
		
	}
	
	@DeleteMapping("/users")
    public void removeAlleUsers() throws Exception{
		try {
			this.authService.removeAllUser();
		}catch(Exception e){
			e.printStackTrace();
		}
    }

}
