package com.lzblog.module.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzblog.module.entity.User;
import com.lzblog.module.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "")   
	public String test() {   
		User user = userService.get("123");
		System.out.println(user.getName());
		return "index";                 
	}          
}        
