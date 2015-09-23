package com.foreveross.ssh.dao;

import com.foreveross.ssh.entity.Log;

public interface ILogDao {
	public void add(Log log);
	public void delete(Log log);
	public void update(Log log);
	public void findAll(Log log);
	public void findById(Log log);
}
