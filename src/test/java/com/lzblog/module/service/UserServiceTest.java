package com.lzblog.module.service;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lzblog.module.entity.User;

/**
 * @author lz
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-service.xml","classpath:spring-mybatis.xml"})
public class UserServiceTest {
	private Logger logger = Logger.getLogger(this.getClass()); 
	@Autowired
	private UserService userService;
	
	@org.junit.Test
	public void Test() { 
		User user = userService.get("123"); 
		logger.info(user.getName());
	}
}
