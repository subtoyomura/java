package com.example.demo.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Board;

@Repository
public class BoardDaoImpl implements BoardDao {
	private  JdbcTemplate jdbcTemplate;

	@Autowired
	public BoardDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Board> findAll() {
		String sql ="select * from boards";
		List<Map<String,Object>>results = jdbcTemplate.queryForList(sql);
		List<Board> boards = new ArrayList<Board>();
		for(Map<String,Object>result:results) {
			Board board = new Board();
			board.setId((int)result.get("id"));
			board.setTitle((String)result.get("title"));
			board.setContent((String)result.get("content"));
			board.setCreatedAt(((Timestamp)result.get("created_at")).toLocalDateTime());
			board.setUpdatedAt(((Timestamp)result.get("updated_at")).toLocalDateTime());
			boards.add(board);
		}
		return boards;
	}
	@Override
	public Board findByld(int getId) {
		Map<String, Object> map = jdbcTemplate.queryForMap("SELECT * FROM boards" + " WHERE id = ?", getId);
		Board user = new Board();
		user.setId((int)map.get("id"));
		user.setTitle((String)map.get("title"));
		user.setContent((String)map.get("content"));
		//user.setCreatedAt(((Timestamp)result.get("created_at")).toLocalDateTime());
		//user.setUpdatedAt(((Timestamp)result.get("updated_at")).toLocalDateTime());
		return user;
	}
}


