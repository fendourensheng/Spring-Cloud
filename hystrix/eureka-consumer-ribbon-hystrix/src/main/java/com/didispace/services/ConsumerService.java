package com.didispace.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.didispace.domain.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConsumerService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallbacks")
	public User findById(Long id) {
		System.out.print("-------------------我最牛逼------------------------------");
		return restTemplate.getForObject("http://EUREKA-CLIENT/user/" + id, User.class);
	}

	public User fallbacks(Long id) {
		System.out.print("-------------------test测试使用------------------------------");
		return restTemplate.getForObject("http://EUREKA-CLIENT/user/" + id, User.class);
	}
}

