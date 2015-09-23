package com.foreveross.ssh.dao;

import java.util.List;

import com.foreveross.ssh.entity.User;

public interface IUserDao {
	public boolean add(User user);
	public boolean delete(User user);
	public boolean update(User user);
	public List<User> findAll();
	public User findById(Integer id);
	
}
