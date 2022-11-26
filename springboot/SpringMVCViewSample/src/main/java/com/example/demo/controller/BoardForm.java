package com.example.demo.controller;


	import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


	public class BoardForm {
          @NotEmpty(message = "タイトルの入力は必須です")
		  @Size(max = 20, message = "タイトルは20文字以内で入力してください")
		private String title;

          @NotEmpty(message = "つぶやきの入力は必須です")
		  @Size(max = 140, message = "つぶやきは140文字以内で入力してください")
		private String content;

          public BoardForm() {

          }
          public BoardForm( String title, String content) {
        	  super();
        	  this.title = title;
        	  this.content = content;

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


	}



