package com.culnou.mumu.auth.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Document(collection = "users")
@Data
public class User {
	
	private String id;
	private boolean signIn = false;
	private String provider;
	private String firstName = "";
	private String lastName = "";
	private String fullName = "";
	private String email = "";
	private String authState = "";
	private UserId userId;
	
	public User(
			    String id, 
			    boolean signIn,
			    String provider,
			    String firstName,
			    String lastName,
			    String fullName,
			    String email,
			    String authState
			) {
		//自己カプセル化
		this.setId(id);
		this.setSignIn(signIn);
		this.setProvider(provider);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setFullName(fullName);
		this.setEmail(email);
		this.setAuthState(authState);
		//識別子オブジェクトの作成
		this.setUserId(id);
	}
	
	protected void setId(String id) {
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
	
	
	
	protected void setSignIn(boolean signIn) {
		this.signIn = signIn;
	}
	
	protected void setProvider(String provider) {
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
	protected void setFullName(String fullName) {
		if(fullName == null) {
			throw new IllegalArgumentException("The fullName may not be set to null.");
		}
		this.fullName = fullName;
	}
	
	
	protected void setEmail(String email) {
		if(email == null) {
			throw new IllegalArgumentException("The email may not be set to null.");
		}
		this.email = email;
	}
	
	protected void setAuthState(String authState) {
		if(authState == null) {
			throw new IllegalArgumentException("The authState may not be set to null.");
		}
		this.authState = authState;
	}
	

}
