package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.Board;


public class BoardServiceImpl implements BoardService {
	private BoardDao boardDao;

	public BoardServiceImpl(BoardDao boradDao) {
		this.boardDao = boradDao;
	}


	public List<Board> getAll(){
		return boardDao.findAll();
	}


}



