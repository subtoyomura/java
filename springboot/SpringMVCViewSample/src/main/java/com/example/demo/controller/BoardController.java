package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String show(@PathVariable  int id,Model view) {
		Board board = boardService.getBoard(id);
		view.addAttribute("board",board);
		return "show";
	}

	@GetMapping("/create")
	public String create(@Validated
            @ModelAttribute Board board,Model view) {
		boardService.save(board);
		return "create";
	}

	 @PostMapping("/store")
	    public String create(Model model) {

	        // login.htmlにリダイレクト
	        return "redirect:/create";
	    }
	}

