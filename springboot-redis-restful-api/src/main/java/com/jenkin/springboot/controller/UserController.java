package com.jenkin.springboot.controller;

import com.jenkin.springboot.pojo.User;
import com.jenkin.springboot.service.UserService;
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
	public Map<String, User> getAll() {
		return userService.getAll();
	}

	/*
	 * @RequestMapping("/users/{id}") public User getUserById(@PathVariable String
	 * id) { return userService.getUserById(id); }
	 */

	/**
	 * POST
	 */
	/*
	 * @RequestMapping(value = "/users", method = RequestMethod.POST) public void
	 * addUser(@RequestBody User user) { userService.addUser(user); }
	 * 
	 *//**
		 * DELETE
		 */
	/*
	 * @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE) public
	 * void deleteUserById(@PathVariable String id) {
	 * userService.deleteUserById(id); }
	 * 
	 *//**
		 * PUT
		 *//*
			 * @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT) public
			 * void updateUserById(@RequestBody User user, @PathVariable String id) {
			 * userService.updateUserById(user, id); }
			 */
}
