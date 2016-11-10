package com.lzblog.module.dao;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lzblog.module.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest { 
	 private Logger logger = Logger.getLogger(this.getClass());
	@Resource
	private UserDao userDao;
	  
	@org.junit.Test
	public void Test() {
		User user = userDao.get("123");
		logger.info(user.getName());    
	}
} 
