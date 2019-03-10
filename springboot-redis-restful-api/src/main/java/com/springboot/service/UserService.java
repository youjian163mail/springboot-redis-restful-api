package com.springboot.service;

import java.util.Map;

import com.springboot.pojo.User;

public interface UserService {
    Map<Integer, User> getAll();

    User getUserById(int id);

	void addUser(User user);
	
	void deleteUserById(int id);
	
	void updateUserById(User user, int id);
}
