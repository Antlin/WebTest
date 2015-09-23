package com.foreveross.ssh.service;

import com.foreveross.ssh.entity.Log;

public interface ILogService {
	public void add(Log log);
	public void delete(Log log);
	public void update(Log log);
	public void findAll(Log log);
	public void findById(Log log);
}
