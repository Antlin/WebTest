package com.foreveross.ssh.service;

import java.util.Date;
import java.util.List;

import com.foreveross.ssh.dao.ILogDao;
import com.foreveross.ssh.dao.IUserDao;
import com.foreveross.ssh.entity.Log;
import com.foreveross.ssh.entity.User;

public class UserService implements UserDaoService {
	private IUserDao iud;
	private ILogDao	ild;
	private Log log;
	private List<User> lists;
	public ILogDao getIld() {
		return ild;
	}
	public void setIld(ILogDao ild) {
		this.ild = ild;
	}
	
	public Log getLog() {
		return log;
	}
	public void setLog(Log log) {
		this.log = log;
	}
	public IUserDao getIud() {
		return iud;
	}
	public void setIud(IUserDao iud) {
		this.iud = iud;
	}
	
	
	@Override
	public boolean add(User user) {
		//System.out.println(user.getAge());
		//iud.add(user);
		log.setLogDate(new Date());
		log.setLogType("����û�");
		ild.add(log);
		return iud.add(user);
	}
	@Override
	public boolean delete(Integer id) {
		
		iud.delete(findById(id));
		log.setLogDate(new Date());
		log.setLogType("ɾ���û�");
		ild.delete(log);
		return true;
		 
	}
	@Override
	public boolean update(User user) {
		 
		 iud.update(user);
		 log.setLogDate(new Date());
		 log.setLogType("����û�");
		 ild.update(log);
		 return true;
		
	}
	@Override
	public List<User> findAll() {
		lists=iud.findAll();
		log.setLogDate(new Date());
		 log.setLogType("�鿴�û��б�");
		 ild.findAll(log);		
		return lists;
	
	}
	@Override
	public User findById(Integer id) {
	 log.setLogDate(new Date());
		 log.setLogType("�鿴�����û�");
		 ild.findById(log);
		return iud.findById(id);
	
	}
}
