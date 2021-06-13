package com.culnou.mumu.auth.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.culnou.mumu.auth.controller.UserResource;
import com.culnou.mumu.auth.domain.model.UserId;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthServiceTest {
	
	@Qualifier("authRestService")
	@Autowired
	private AuthService authService;
	
	@After
	public void tearDown() throws Exception {
		//全Userの削除
		this.authService.removeAllUser();
	}
	
	@Test
	public void testSignIn() throws Exception{
		UserResource userResource = new UserResource("11111", "sagawa", "This is sagawa.", true, "Apple", "satoshi sagawa", "sagawa@ss.com", "normal");
		authService.signIn(userResource);
		UserId id = new UserId(userResource.getId());
		UserResource readUser = authService.findUserById(id);
		assertNotNull(readUser);
		assertEquals(readUser.getId(), userResource.getId());
	}

}
