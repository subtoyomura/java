package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.UserServiceImpl;

@Controller
public class TestController {



	@GetMapping("/test")
	public String test(Model view) {
		UserServiceImpl user = new UserServiceImpl();
		view.addAttribute("listTest",user);

		return "test";
	}
}
