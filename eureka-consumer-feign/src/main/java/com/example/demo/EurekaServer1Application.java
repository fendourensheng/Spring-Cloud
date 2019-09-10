package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//开启服务发现能力
@EnableDiscoveryClient
public class EurekaServer1Application {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer1Application.class, args);
	}

}
