package com.lzblog.module.entity;

import com.lzblog.common.entity.BaseEntity;

public class User extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public String getName() {  
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
