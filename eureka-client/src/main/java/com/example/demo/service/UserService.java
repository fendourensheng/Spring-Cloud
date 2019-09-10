package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;

@Service
public class UserService {
	private static Map<Long,User> users =new HashMap<>();
	static {
		users.put(1L, new User(1L, "xiaxuan", 24));
        users.put(2L, new User(2L, "bingwen", 24));
	}
	public User findUserById(Long id) {
		return users.get(id);
	}
}
