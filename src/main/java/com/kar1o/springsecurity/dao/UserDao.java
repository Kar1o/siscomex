package com.kar1o.springsecurity.dao;

import com.kar1o.springsecurity.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

