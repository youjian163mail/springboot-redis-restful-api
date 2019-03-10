package com.jenkin.springboot.service;

import com.jenkin.springboot.pojo.User;

import java.util.Map;

public interface UserService {
    Map<Integer, User> getAll();

    User getUserById(int id);

	void addUser(User user);
	
	void deleteUserById(int id);
	
	/*
	 * 
	 * void updateUserById(User user, String id);
	 * 
	 */
}
