package com.ace.holidays.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.ace.holidays.db.TestDB;
import com.ace.holidays.model.User;
import com.ace.holidays.service.TestService;

public class TestServiceImpl implements TestService {
	
	@Autowired
	@Resource
	TestDB testDB;

	public String sayHello(User user) {
		testDB.save(user);
		return "Hello "+user.getName()+"!";
	}
}