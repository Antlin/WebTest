package com.foreveross.ssh.entity;

import java.util.Date;

public class User {
	private String name;
	private Integer uid;
	private Date birtday;
	private int age;
	
	public User() {
	}

	public User(String name, Date birtday, int age) {
		super();
		this.name = name;
		this.birtday = birtday;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Date getBirtday() {
		return birtday;
	}
	public void setBirtday(Date birtday) {
		this.birtday = birtday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
