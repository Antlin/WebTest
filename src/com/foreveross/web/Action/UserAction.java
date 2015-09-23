package com.foreveross.web.Action;

import java.util.List;

import com.foreveross.ssh.entity.User;
import com.foreveross.ssh.service.UserDaoService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private UserDaoService userService;

	private User user;
	private List<User> list;
	
	public UserDaoService getUserService() {
		return userService;
	}

	public void setUserService(UserDaoService userService) {
		this.userService = userService;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String add() throws Exception {
		System.out.println(user.getAge());
		userService.add(user);
		System.out.println("add");
		return "add";
	}
	public String delete() throws Exception {
		userService.delete(user.getUid());
		return "delete";
	}
	public String update() throws Exception {
		
		userService.update(user);
		return "update";
	}
	public String findAll() throws Exception {
		list=userService.findAll();
		 return "list"; 
	}
	public String findById() throws Exception {
		userService.findById(user.getUid());
		return "finById";
	}
	public String updateFind() throws Exception{
		user=userService.findById(user.getUid());
		return "updateFind";
	}

}
