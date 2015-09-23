package com.foreveross.ssh.service;

import java.util.List;

import com.foreveross.ssh.entity.User;

public interface UserDaoService {

	public boolean add(User user);
	public boolean delete(Integer id);
	public boolean update(User user);
	public List<User> findAll();
	public User findById(Integer id);
}
