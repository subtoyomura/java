package com.example.demo.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}


	public List<User> getAll(){
		return userDao.findAll();
	}


}
