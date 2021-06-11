package com.culnou.mumu.auth.domain.model.entity;

import java.io.Serializable;

public final class UserId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	
	public UserId(String userId) {
		this.setUserId(userId);
	}
	
	public void setUserId(String userId) {
		if(userId == null) {
			throw new IllegalArgumentException("The userId may not be set to null.");
		}
		this.userId = userId;
	}
	
	public String getUserId() {
		return this.userId;
	}

}
