package com.culnou.mumu.auth.domain.model.entity;
import static org.junit.Assert.*;

import org.junit.Test;

public class UserIdTest {
	
	
    //UserIdを生成するとき引数で指定されていないとIllegalArgumentExceptiondが発生するか。
	@Test(expected = IllegalArgumentException.class)
	public void testConstructUserIdWithOutArgument() {
		String id = null;
		UserId userId = new UserId(id);
		
	}
	//値オブジェクトの不変性のテスト。
	/*
	@Test
	public void testInvariant() {
		//自身とクローンの等価性検証。
		UserId id = new UserId("11111");
		UserId copy = new UserId(id);
		assertEquals(id, copy);
		//副作用のないメソッドの実行
		System.out.println(id.getUserId());
		//メソッドを実行することによって自身の状態が変化していないか検証。
		assertEquals(id, copy);
	}
	*/
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
