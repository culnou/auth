package com.culnou.mumu.auth.controller;



import com.culnou.mumu.auth.application.Dto;

import lombok.Data;

@Data
public class UserResource implements Dto{
	
	private String id;
	private boolean signIn = false;
	private String provider;
	private String firstName = "";
	private String lastName = "";
	private String fullName = "";
	private String email = "";
	private String authState = "";
	
	public UserResource(
			String id,
			boolean signIn,
			String provider,
			String firstName,
			String lastName,
			String fullName,
			String email,
			String autState
			) {
		this.setId(id);
		this.setSignIn(signIn);
		this.setProvider(provider);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setFullName(fullName);
		this.setEmail(email);
		this.setAuthState(authState);
	}
	
	
	public void setId(String id) {
		if(id == null) {
			throw new IllegalArgumentException("The id may not be set to null.");
		}
		this.id = id;
	}
	
	
	
	
	
	public void setSignIn(boolean signIn) {
		this.signIn = signIn;
	}
	
	public void setProvider(String provider) {
		if(provider == null) {
			throw new IllegalArgumentException("The provider may not be set to null.");
		}
		this.provider = provider;
	}
	protected void setFirstName(String firstName) {
		if(firstName == null) {
			throw new IllegalArgumentException("The firstName may not be set to null.");
		}
		this.firstName = firstName;
	}
	protected void setLastName(String lastName) {
		if(lastName == null) {
			throw new IllegalArgumentException("The lastName may not be set to null.");
		}
		this.lastName = lastName;
	}
	public void setFullName(String fullName) {
		if(fullName == null) {
			throw new IllegalArgumentException("The fullName may not be set to null.");
		}
		this.fullName = fullName;
	}
	
	
	public void setEmail(String email) {
		if(email == null) {
			throw new IllegalArgumentException("The email may not be set to null.");
		}
		this.email = email;
	}
	
	public void setAuthState(String authState) {
		if(authState == null) {
			throw new IllegalArgumentException("The authState may not be set to null.");
		}
		this.authState = authState;
	}

}
