package com.culnou.mumu.auth.domain.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Document(collection = "users")
@Data
public class User {
	
	private String id;
	private String name;
	private String description;
	private boolean signIn = false;
	private String provider;
	private String fullName = "";
	private String email = "";
	private String authState = "";
	private UserId userId;
	
	public User(
			    String id, 
			    String name,
			    String description,
			    boolean signIn,
			    String provider,
			    String fullName,
			    String email,
			    String authState
			) {
		this.setId(id);
		this.setUserId(id);
		this.setName(name);
		this.setDescription(description);
		this.setSignIn(signIn);
		this.setProvider(provider);
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
	
	private void setUserId(String id) {
		if(id == null) {
			throw new IllegalArgumentException("The id may not be set to null.");
		}
		this.userId = new UserId(id);
	}
	
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("The name may not be set to null.");
		}
		this.name = name;
	}
	
	public void setDescription(String description) {
		if(description == null) {
			throw new IllegalArgumentException("The description may not be set to null.");
		}
		this.description = description;
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
