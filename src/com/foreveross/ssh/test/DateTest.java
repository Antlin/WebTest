package com.foreveross.ssh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.foreveross.ssh.entity.User;
import com.foreveross.ssh.service.UserService;

public class DateTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-common.xml");
		UserService service=(UserService)context.getBean("userService");
		
		/*	User u=new User();
		
		u.setName("zhangsan");
		u.setBirtday(new java.util.Date());
		u.setAge(10);*/
		service.delete(1);
	}
}
