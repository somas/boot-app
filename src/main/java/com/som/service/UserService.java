package com.som.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.som.bean.User;
import com.som.dao.UserRepository;

@Component
public class UserService {

	@Resource
	private UserRepository userRepository;
	
	public User getUser(String userId) {
		return userRepository.findOne(userId);
	}

}