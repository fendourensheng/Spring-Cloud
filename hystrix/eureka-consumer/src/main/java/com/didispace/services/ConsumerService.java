package com.didispace.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.didispace.domain.User;

@Service
public class ConsumerService {

	@Autowired
	private RestTemplate restTemplate;
	public User findById(Long id) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/user/" + id, User.class);
    }
}
