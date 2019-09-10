package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.domain.User;

@Service
public class ConsumerService {
	@Autowired
	private RestTemplate restTemplate;
	
	public User findUserById(Long id) {
		return restTemplate.getForObject("http://EUREKA-CLIENT/user/" + id, User.class);
		
	}
}
