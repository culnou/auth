package com.culnou.mumu.auth.domain.model;
import static org.junit.Assert.*;

import org.junit.Test;

import com.culnou.mumu.auth.domain.model.UserId;

public class UserIdTest {
	
	
    //UserIdを生成するとき引数で指定されていないとIllegalArgumentExceptiondが発生するか。
	@Test(expected = IllegalArgumentException.class)
	public void testConstructUserIdWithOutArgument() {
		String id = null;
		UserId userId = new UserId(id);
		
	}
	//値オブジェクトの不変性のテスト。
	@Test
	public void testInvariant() {
		//自身とクローンの等価性検証。
		UserId id = new UserId("11111");
		UserId clone = id.clone();
		assertEquals(id, clone);
		//副作用のないメソッドの実行
		System.out.println(id.getId());
		//メソッドを実行することによって自身の状態が変化していないか検証。
		assertEquals(id, clone);
	}
	
	//値オブジェクトの等価性のテスト。
	@Test
	public void testEquality() {
		UserId id1 = new UserId("11111");
		UserId id2 = new UserId("11111");
		assertEquals(id1, id2);
	}
	
	//値オブジェクトの交換可能性のテスト。
	@Test
	public void testExchangeability() {
		UserId id1 = new UserId("11111");
		UserId id2 = new UserId("22222");
		UserId id3 = new UserId("22222");
		assertNotEquals(id1, id3);
		//id1をid2に置き換える。
		id1 = id2;
		assertEquals(id1, id3);
	}

}
