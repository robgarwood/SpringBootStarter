package com.garwood.SpringBootTest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garwood.SpringBootTest.model.Cheese;
import com.garwood.SpringBootTest.model.Ham;
import com.garwood.SpringBootTest.model.User;
import com.garwood.SpringBootTest.service.TestService;

@RestController
public class TestRestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping("/ham")
	public Ham getHam() {
		return testService.getHam();
	}
	
	@RequestMapping("/cheese")
	public Cheese getCheese() {
		return testService.getCheese();
	}
	
	@RequestMapping("/user")
	public User getUser() {
		return testService.getUser("Robert");
	}

}
