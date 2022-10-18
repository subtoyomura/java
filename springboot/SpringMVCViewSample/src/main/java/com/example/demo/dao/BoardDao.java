package com.example.demo.dao;

import java.util.List;

public interface BoardDao<Board> {



	List<Board> findAll();
	Board findByld(int id);

}