package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-client-1")
public interface FeignClients {
//	@RequestLine("GET /eureka-client-1/user")
	@RequestMapping(value = "/eureka-client-1/user",method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
	public String consumer(@RequestParam("id") Long id);
}
