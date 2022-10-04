package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;


@Controller
public class TestController {
	private UserService userService;
	public TestController(UserService userService) {
		this.userService = userService;
	}



	@GetMapping("/test")
	public String test(Model view) {
		List<User> users = userService.getAll();
		view.addAttribute("users",users);

		return "test";
	}
}
