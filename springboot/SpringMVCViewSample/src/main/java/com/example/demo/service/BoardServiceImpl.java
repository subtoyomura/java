package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.Board;

@Service
public class BoardServiceImpl implements BoardService {
	private BoardDao boardDao;

	public BoardServiceImpl(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	public List<Board> getAll(){
		return boardDao.findAll();
	}
	public Board getBoard(int id) {
		return  boardDao.findByld(id);
	}

	public void save(Board board) {
		boardDao.insert(board);
	}
//public void update(Board board) {
	//boardDao.update(board);
//}
}
