package com.foreveross.ssh.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.foreveross.ssh.entity.Log;

public class LogDao extends HibernateDaoSupport implements ILogDao {
	
	HibernateTemplate ht;
	@Override
	public void add(Log log) {
		System.out.println("123log");
		ht=this.getHibernateTemplate();

		ht.save(log);
	}

	@Override
	public void delete(Log log) {
		ht=this.getHibernateTemplate();
		
		ht.save(log);
	}

	@Override
	public void update(Log log) {
		ht=this.getHibernateTemplate();
		
		ht.save(log);
	}

	@Override
	public void findAll(Log log) {
		ht=this.getHibernateTemplate();
		ht.save(log);
	}

	@Override
	public void findById(Log log) {
		ht=this.getHibernateTemplate();
		ht.save(log);
	}

}
