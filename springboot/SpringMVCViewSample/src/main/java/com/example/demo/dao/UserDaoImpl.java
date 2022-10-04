package com.example.demo.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
private final JdbcTemplate jdbcTemplate;

@Autowired
public UserDaoImpl(final JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

@Override
public List<User> findAll() {
	String sql ="select * from users";
	List<Map<String,Object>>results = jdbcTemplate.queryForList(sql);
	List<User> users = new ArrayList<User>();
	for(Map<String,Object>result:results) {
		User user = new User();
		user.setId((int)result.get("id"));
		user.setName((String)result.get("name"));
		user.setEmail((String)result.get("email"));
		user.setCreatedAt(((Timestamp)result.get("created_at")).toLocalDateTime());
		user.setUpdatedAt(((Timestamp)result.get("updated_at")).toLocalDateTime());
        users.add(user);
	}
	return users;
}
}
