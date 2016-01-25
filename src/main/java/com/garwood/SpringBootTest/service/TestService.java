package com.garwood.SpringBootTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garwood.SpringBootTest.model.Cheese;
import com.garwood.SpringBootTest.model.Ham;
import com.garwood.SpringBootTest.model.User;
import com.garwood.SpringBootTest.model.UserRepository;

@Service
public class TestService {
	
	@Autowired
	private UserRepository userRepository;

	public Cheese getCheese() {
		return new Cheese();
	}
	
	public Ham getHam() {
		return new Ham();
	}
	
	public User getUser(String name) {
		return userRepository.getUserForName(name);
	}
}
