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
	//不変性の担保。2021/6/11
	//privateにし外部から属性を変更できないようにする。
	private void setUserId(String userId) {
		if(userId == null) {
			throw new IllegalArgumentException("The userId may not be set to null.");
		}
		this.userId = userId;
	}
	
	public String userId() {
		return this.userId;
	}
	//値の等価性を実現する。2021/6/11
	public boolean equals(Object object) {
		boolean equality = false;
		if(object != null && this.getClass() == object.getClass()) {
			UserId user = (UserId)object;
			if(user.userId == this.userId){
				equality = true;
			}
			
		}
		return equality;
	}

}
