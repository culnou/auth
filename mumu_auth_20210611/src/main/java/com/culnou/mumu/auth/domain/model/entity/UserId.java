package com.culnou.mumu.auth.domain.model.entity;

import java.io.Serializable;




//値オブジェクトの実装①：finalでserializableなクラスにする。
public final class UserId implements Serializable, Cloneable{

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
	
	//値オブジェクトの実装③：クローンの生成
	//単体テストで使用する。
	@Override
	public UserId clone() {
		try {
			super.clone();
		}catch(CloneNotSupportedException e) {
			throw new InternalError();
		}
		return new UserId(this.getId());
	}
		
	//値オブジェクトの実装④：値の等価性を実現する。
	@Override
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
