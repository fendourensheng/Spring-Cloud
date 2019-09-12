package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FeignClients;

@Service
public class ConsumerService implements FeignClients {

	@Autowired
	FeignClients feignclients;
	
	@Override
	public String consumer(Long id) {
		// TODO Auto-generated method stub
		return "10100133441";
	}


}
