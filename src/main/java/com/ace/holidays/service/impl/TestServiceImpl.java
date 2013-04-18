package com.ace.holidays.service.impl;

import com.ace.holidays.model.User;
import com.ace.holidays.service.TestService;

public class TestServiceImpl implements TestService {

	public String sayHello(User user) {
		return "Hello "+user.getName()+"!";
	}
}