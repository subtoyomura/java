package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {

	private BoardService boardService;
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}



	@GetMapping("/index")
	public String index(Model view) {
		List<Board> boards = boardService.getAll();
		view.addAttribute("boards",boards);
		return "index";
	}
	@GetMapping("/show/{id}")
	public String show(@ModelAttribute int getId,Model view) {
		Board user = boardService.getBoard(getId);
		view.addAttribute("users",user);
		return "show";

	}

}
