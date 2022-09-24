package com.example.demo.entity;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.MemberCrudRepository;

@Controller
public class TestController {
	@Autowired
	private MemberCrudRepository memberCrudRepository;

    @GetMapping("/test")
    public String hello(Model model) {
    	List <Member>users = (List<Member>) memberCrudRepository.findAll();
        model.addAttribute("userslist",users);
        return "test";
    }
}