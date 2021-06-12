package com.culnou.mumu.auth.domain.model.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
//値オブジェクトの実装①：finalでserializableなクラスにする。
public final class UserId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String id;
	//値オブジェクトの実装②：プライマリーコンストラクタ
	//privateなセッターで自己カプセル化して属性を設定して初期化することで不変性を担保する。2021/6/11
	public UserId(String id) {
		//自己カプセル化する。
		this.setId(id);
	}
	
	//値オブジェクトの実装③：コピーコンストラクター
	//単体テストで使用する。
	/*
	public UserId(UserId userId) {
		this(userId.userId);
	}
	*/
	
	private void setId(String userId) {
		if(userId == null) {
			throw new IllegalArgumentException("The userId may not be set to null.");
		}
		this.id = userId;
	}
	
	//副作用のないメソッド。
	public String getId() {
		return this.id;
	}
	//値オブジェクトの実装④：値の等価性を実現する。
	public boolean equals(Object object) {
		boolean equality = false;
		if(object != null && this.getClass() == object.getClass()) {
			UserId userId = (UserId)object;
			//必ず参照の比較（＝＝）ではなく内容の比較（equals）を行う。
			if(userId.id.equals(this.id)){
				equality = true;
			}
			
		}
		return equality;
	}

}
