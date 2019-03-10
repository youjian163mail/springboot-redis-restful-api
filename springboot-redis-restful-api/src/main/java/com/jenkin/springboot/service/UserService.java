package com.jenkin.springboot.service;

import com.jenkin.springboot.pojo.User;

import java.util.Map;

public interface UserService {
    Map<String, User> getAll();

	/*
	 * void addUser(User user);
	 * 
	 * void deleteUserById(String id);
	 * 
	 * void updateUserById(User user, String id);
	 * 
	 * User getUserById(String id);
	 */
}
