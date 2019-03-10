package com.springboot.controller;

import com.springboot.pojo.User;
import com.springboot.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

	@Autowired
	public User user;

	@Autowired
	public UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Map<Integer, User> getAll() {
		return userService.getAll();
	}

	@RequestMapping("/users/{id}")
	public User getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public void deleteUserById(@PathVariable Integer id) {
		userService.deleteUserById(id);
	}
	 
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public void updateUserById(@RequestBody User user, @PathVariable Integer id) {
		userService.updateUserById(user, id);
	}
}
