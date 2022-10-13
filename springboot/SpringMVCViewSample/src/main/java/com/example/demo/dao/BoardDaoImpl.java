package com.example.demo.dao;

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
		List<Board> users = new ArrayList<Board>();
		for(Map<String,Object>result:results) {
			Board user = new Board();
			user.setId((int)result.get("id"));
			user.setTitle((String)result.get("title"));
			user.setContent((String)result.get("content"));
			//user.setCreatedAt(((Timestamp)result.get("created_at")).toLocalDateTime());
			//user.setUpdatedAt(((Timestamp)result.get("updated_at")).toLocalDateTime());
	        users.add(user);
		}
		return users;
	}
	}


