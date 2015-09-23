package com.foreveross.ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.foreveross.ssh.entity.User;

public class CopyOfUserDao extends HibernateDaoSupport implements IUserDao {


	
	HibernateTemplate ht=null;
	@Override
	public boolean add(User user) {
		ht=this.getHibernateTemplate();
		ht.save(user);
		return false;
	}

	@Override
	public boolean delete(User user) {
		ht=this.getHibernateTemplate();
		ht.delete(user);
		return true;
	}

	@Override
	public boolean update(User user) {
		ht=this.getHibernateTemplate();
		ht.update(user);		
		return true;
	}

	@Override
	public User findById(Integer id) {
		ht=this.getHibernateTemplate();
		List list=  ht.find("from User where id=?", id);
		return (User) list.get(0);
	}

	@Override
	public List<User> findAll() {
		ht=this.getHibernateTemplate();
		List<User> lists=ht.find("from User");
		return lists;
	}

}
