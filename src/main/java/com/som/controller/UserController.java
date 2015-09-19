package com.som.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.som.bean.User;
import com.som.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value ="/{user_id}", method = RequestMethod.GET)
	public User getUser(@PathVariable("user_id") String userId) {
		return userService.getUser(userId);
	}
	
}
