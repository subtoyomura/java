package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "users")
public class User {
	@Id
	@Column(name = "id")
	private Integer id;
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "name")
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "email")
	private String email;
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "created_at")
	private Integer created_at;
	public Integer getCreated_at() {
		return this.created_at;
	}
	public void setCreated_at(Integer created_at) {
		this.created_at = created_at;
	}
	@Column(name = "updated_at")
	private Integer updated_at;
	public Integer getUpdated_at() {
		return this.updated_at;
	}
	public void setUpdated_at(Integer updated_at) {
		this.updated_at = updated_at;
	}
}
