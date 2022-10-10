package com.example.demo.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;


public class BoardController {

	private BoardService boardService;
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}



	@GetMapping("/board/index")
	public String test(Model view) {
		List<Board> users = boardService.getAll();
		view.addAttribute("users",users);

		return "index";
	}
}
