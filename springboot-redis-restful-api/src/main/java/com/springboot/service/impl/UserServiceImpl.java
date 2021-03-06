package com.springboot.service.impl;

import com.springboot.pojo.User;
import com.springboot.service.UserService;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {
	/*
	 * @Autowired private HashOperations hashOperations;
	 * 
	 * @Override public Map<String, User> getAll() { Map<String, User> map =
	 * hashOperations.entries("USERS"); return map; }
	 * 
	 * @Override public void addUser(User user) { hashOperations.put("USERS",
	 * user.getId(), user); }
	 * 
	 
	 * 
	 * @Override public void updateUserById(User user, String id) {
	 * hashOperations.put("USERS", id, user); }
	 */
	
	
	
	
	private Map<Integer, User> map;
	
	public UserServiceImpl() {
		map = new HashMap<>();
		
		User user = null;
		user = new User(1, "user1", 10, "user1@email.com");
		map.put(user.getId(), user);
		
		user = new User(2, "user2", 20, "user2@email.com");
		map.put(user.getId(), user);
		
		user = new User(3, "user3", 30, "user3@email.com");
		map.put(user.getId(), user);
		
		user = new User(4, "user4", 40, "user4@email.com");
		map.put(user.getId(), user);
		
		user = new User(5, "user5", 50, "user5@email.com");
		map.put(user.getId(), user);
	}
	
	public Map<Integer, User> getAll() {
		return this.map;
	}

	@Override
	public User getUserById(int id) {
		return this.map.get(id);
	}
	
	public void addUser(User user) {
		this.map.put(user.getId(), user);
	}

	@Override
	public void deleteUserById(int id) {
		this.map.remove(id);
	}
	
	@Override
	public void updateUserById(User user, int id) {
		this.map.put(id, user);
	}
}
