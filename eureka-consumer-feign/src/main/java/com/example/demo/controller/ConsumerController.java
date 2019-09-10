package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ConsumerService;

@RestController
public class ConsumerController {
	@Autowired
	ConsumerService consumerService;
	 
	@RequestMapping(value = "/consumer",method = RequestMethod.GET)
	private  String findById(@RequestParam Long id) {
		return consumerService.consumer(id);
	}
}
