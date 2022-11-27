package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Board;

public interface BoardDao {



	List<Board> findAll();
	Board findByld(int id);
	void insert(Board board);
}