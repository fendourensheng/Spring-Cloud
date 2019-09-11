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
import com.didispace.services.ConsumerService;

/**
 * 
 * @author gaoshuai
 *
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerController.class);

	@Autowired
	private ConsumerService consumerService;

	/**
	 * 采用缺省配置
	 */
	static {
		BasicConfigurator.configure();
	}

	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		User user = consumerService.findById(id);
		LOGGER.info("获取到的用户id为 {}, User为 {}", id, user);
		return user;
	}
}
