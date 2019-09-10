package com.example.demo.controller;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.ConsumerService;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	private static final  Logger LOGGER=LoggerFactory.getLogger(ConsumerController.class);
	
	@Autowired
	private ConsumerService consumerService;
	
	static {
		BasicConfigurator.configure();
	}
	
	@GetMapping("/{id}")
	private User findById(@PathVariable Long id) {
		User user=consumerService.findUserById(id);
		LOGGER.info("获取用户id{}的用户，详细信息为{}",id,user);
		return user;
	}
}
