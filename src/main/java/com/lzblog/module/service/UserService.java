package com.lzblog.module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzblog.module.dao.UserDao;
import com.lzblog.module.entity.User;
/**
 * ÒµÎñÂß¼­
 * @author lz
 */
@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User get(String id) {
		User user = userDao.get("123");  
		return user;
	}
} 
