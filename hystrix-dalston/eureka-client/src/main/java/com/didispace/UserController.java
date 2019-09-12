package com.didispace;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.didispace.domain.User;
import com.didispace.service.UserService;

/**
 * 
 * @author gaoshuai
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	/**
	 * 目前图简便，就用缺省的配置了
	 */
	static {
		BasicConfigurator.configure();
	}

	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) throws InterruptedException {
		//hystrix测试加些延迟
		Thread.sleep(5000L);
		User user = userService.findUserById(id);
		LOGGER.info("获取用户id为 {} 的用户，详细信息为 {}", id, user);
		return user;
	}

}
