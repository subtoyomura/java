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

	private JdbcTemplate jdbcTemplate;
	/**
	 * コンストラクタ
	 * @param jdbcTemplate JdbcTemplate
	 */
	@Autowired
	public void UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@GetMapping("/test")
	public String test(Model view) {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from users");
		System.out.println(list);
		view.addAttribute("listTest",list);

		return "test";
	}
}
