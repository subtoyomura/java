package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String index(Model view, @ModelAttribute("store") String complete) {
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
	public String create(BoardForm boardForm, Model view) {
		return "create";
	}
	@PostMapping("/create")
	public String createGoBack(BoardForm boardForm, Model view) {
		return "create";
	}

	@PostMapping("/create/confirm")
	public String createConfirm(@Validated BoardForm boardForm, BindingResult result, Model view) {
		if(result.hasErrors()) {
			return "create";
		}
		return"create_confirm";
	}
	@PostMapping("/store")
	public String store(@Validated BoardForm boardForm,
			BindingResult result,
			Model view,
			RedirectAttributes redirectAttributes) {

		if(result.hasErrors()) {
			return "create_confirm";
		}

		LocalDateTime nowTime = LocalDateTime.now();

		Board board = new Board();
		board.setTitle(boardForm.getTitle());
		board.setContent(boardForm.getContent());
		board.setCreatedAt(nowTime);
		board.setUpdatedAt(nowTime);
		boardService.save(board);

		redirectAttributes.addFlashAttribute("complete", "つぶやきの登録に成功しました");

		return "redirect:/board/index";
	}









	@GetMapping("/board/edit/{id}")
	public String edit(@PathVariable BoardForm boardForm, int id,Model view) {
		Board board = boardService.getBoard(id);
		view.addAttribute("board",board);
		return "edit";
	}
	@PostMapping("/board/edit/confirm")
	public String editConfirm(@Validated BoardForm boardForm, BindingResult result,int id, Model view) {
		if(result.hasErrors()) {
			return "edit";
		}
		return"edit_confirm";
	}
	@PostMapping("/board/edit/{id}")
	public String editGoBack(BoardForm boardForm,int id, Model view) {
		return "edit";
	}

	@PostMapping("/board/update")
	public String update(@Validated BoardForm boardForm,
			BindingResult result,
			int id,
			Model view,
			RedirectAttributes redirectAttributes) {

		if(result.hasErrors()) {
			return "edit_confirm";
		}

		LocalDateTime nowTime = LocalDateTime.now();

		Board board = new Board();
		board.setTitle(boardForm.getTitle());
		board.setContent(boardForm.getContent());
		board.setCreatedAt(nowTime);
		board.setUpdatedAt(nowTime);
		boardService.save(board);

		redirectAttributes.addFlashAttribute("complete", "つぶやきの登録に成功しました");

		return "redirect:/board/index";
	}
}
