package com.culnou.mumu.auth.domain.model.repository;
import static org.junit.Assert.*;


import java.util.Collection;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.culnou.mumu.auth.domain.model.entity.User;
import com.culnou.mumu.auth.domain.model.entity.UserId;
import com.culnou.mumu.auth.infrastructure.persistence.UserJpaMongoRepository;
import com.culnou.mumu.auth.infrastructure.persistence.UserMongoRepository;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
	//具象クラスをサービス名で切り替えられるようにする。
	@Qualifier("userMongoRepository")
	@Autowired
	private UserRepository userRepository;

	@After
	public void tearDown() throws Exception {
		//全Userの削除
		this.userRepository.removeAll();
	}
	

	@Test
	public void testSaveAndFindOneUser() throws Exception{
		User user = new User("11111", "sagawa", "This is sagawa.", true, "Apple", "satoshi sagawa", "sagawa@ss.com", "normal");
		this.userRepository.saveUser(user);
		User readUser = this.userRepository.findUserById(user.getUserId());
		assertNotNull(readUser);
		assertEquals(user.getUserId(), readUser.getUserId());
		assertEquals(readUser.getUserId(), user.getUserId());
		assertEquals(readUser.getId(), user.getId());
		assertEquals(readUser.getName(), user.getName());
		assertEquals(readUser.getDescription(), user.getDescription());
		assertEquals(readUser.getProvider(), user.getProvider());
		assertEquals(readUser.getEmail(), user.getEmail());
		assertEquals(readUser.isSignIn(), user.isSignIn());
		assertEquals(readUser.getAuthState(), user.getAuthState());
		
	}

}
