package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

@GetMapping("test")
	public String helloView(Model view) {
		view.addAttribute("msg" , "Hello World");
		return "test";
	}
}