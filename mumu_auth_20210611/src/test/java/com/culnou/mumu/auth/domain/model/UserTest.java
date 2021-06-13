package com.culnou.mumu.auth.domain.model;
import static org.junit.Assert.*;

import org.junit.Test;

import com.culnou.mumu.auth.domain.model.User;
import com.culnou.mumu.auth.domain.model.UserId;

public class UserTest {

	@Test
	public void testGetUserId() {
		User user = new User("11111", "sagawa", "This is sagawa.", true, "Apple", "satoshi sagawa", "sagawa@ss.com", "normal");
		UserId userId = user.getUserId();
		assertEquals("11111", userId.getId());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetId() {
		User user = new User(null, "sagawa", "This is sagawa.", true, "Apple", "satoshi sagawa", "sagawa@ss.com", "normal");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetName() {
		User user = new User("11111", null, "This is sagawa.", true, "Apple", "satoshi sagawa", "sagawa@ss.com", "normal");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetDescription() {
		User user = new User("11111", "sagawa", null, true, "Apple", "satoshi sagawa", "sagawa@ss.com", "normal");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetProvider() {
		User user = new User("11111", "sagawa", "This is sagawa.", true, null, "satoshi sagawa", "sagawa@ss.com", "normal");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetFullName() {
		User user = new User("11111", "sagawa", "This is sagawa.", true, "Apple", null, "sagawa@ss.com", "normal");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetEmail() {
		User user = new User("11111", "sagawa", "This is sagawa.", true, "Apple", "satoshi sagawa", null, "normal");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSetAuthState() {
		User user = new User("11111", "sagawa", "This is sagawa.", true, "Apple", "satoshi sagawa", "sagawa@ss.com", null);
	}
	

}
