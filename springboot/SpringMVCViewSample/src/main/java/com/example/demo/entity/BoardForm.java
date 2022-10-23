package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.validation.constraints.Size;


public class BoardForm {
	private int id;

	  @Size(max = 20, message = "タイトルは20文字以内で入力してください")
	private String title;
	  @Size(max = 140, message = "つぶやきは140文字以内で入力してください")
	private String content;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public BoardForm() {

	}
	public BoardForm(int id, String title, String content, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}


