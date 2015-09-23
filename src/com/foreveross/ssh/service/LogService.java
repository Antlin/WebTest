package com.foreveross.ssh.service;


import com.foreveross.ssh.dao.ILogDao;
import com.foreveross.ssh.entity.Log;

public class LogService implements ILogDao {
	public ILogDao logDao;
	
	public ILogDao getLogDao() {
		return logDao;
	}

	public void setLogDao(ILogDao logDao) {
		this.logDao = logDao;
	}

	@Override
	public void add(Log log) {

		logDao.add(log);
	}

	@Override
	public void delete(Log log) {
		logDao.delete(log);
	}

	@Override
	public void update(Log log) {
		logDao.update(log);
	}

	@Override
	public void findAll(Log log) {
		logDao.findAll(log);
	}

	@Override
	public void findById(Log log) {
		logDao.findById(log);
	}

}
