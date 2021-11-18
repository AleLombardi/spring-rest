package com.rest.al.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Post {

	
 private @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
	
	private String title;
	
	private String body;
	
	
	public Post() {
	
	}


	public Post(String title, String body) {
		super();
		this.title = title;
		this.body = body;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}
	
	
	
	
	
	
	
}
