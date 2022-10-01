package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;


@Configurable
public interface UserDao<User> {
	List<User>findAll();

}
