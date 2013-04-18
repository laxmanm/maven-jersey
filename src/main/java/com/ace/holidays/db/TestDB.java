package com.ace.holidays.db;

import org.springframework.stereotype.Repository;

import com.ace.holidays.model.User;

@Repository
public interface TestDB {
	public void save(User user);
}
