package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class TestController {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from users");

	@GetMapping("/test")
	public String model(Model view) {
		view.addAttribute("listTest",list);

		return "test";
}
}
