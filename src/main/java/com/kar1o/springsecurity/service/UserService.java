package com.kar1o.springsecurity.service;

import com.kar1o.springsecurity.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}