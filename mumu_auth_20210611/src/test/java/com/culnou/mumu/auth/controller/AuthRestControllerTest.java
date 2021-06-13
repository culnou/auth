package com.culnou.mumu.auth.controller;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AuthRestControllerTest {
	
	@Autowired
	private TestRestTemplate template;
	
	@LocalServerPort
	private int port;
	
	private HttpHeaders httpHeaders;
	
	private final ObjectMapper objectMapper = new ObjectMapper();
	
	private String url;
	
	

	@Before
	public void setUp() throws Exception {
		httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	}

	@After
	public void tearDown() throws Exception {
        url = "http://localhost:" + port + "/users";
		template.delete(url);
		
	}

	@Test
	public void testSignIn() throws Exception{
		JSONObject user = new JSONObject();
		user.put("id", "44444");
		user.put("name", "sagawa");
		user.put("description", "This is sagawa.");
		user.put("signIn", true);
		user.put("provider", "Apple");
		user.put("fullName", "satoshi sagawa");
		user.put("email", "sagawa_satoshi@culnou.com");
		user.put("authState", "normal");
		
		url = "http://localhost:" + port + "/users";
		
		HttpEntity<String> request = 
			      new HttpEntity<String>(user.toString(), httpHeaders);
		
		template.postForObject(url, request, String.class);
		
		//値が帰る場合の方法
		//String personResultAsJsonStr = 
		//		template.postForObject(url, request, String.class);
		//JsonNode root = objectMapper.readTree(personResultAsJsonStr);
		
	}
	
	

}
