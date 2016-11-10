package com.lzblog.common.entity;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 唯一标识
	 */
	protected String id;

	public String getId() { 
		return id;
	}

	public void setId(String id) {
		this.id = id;
	} 
	
}
