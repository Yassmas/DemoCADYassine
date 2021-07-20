package com.example.demo.model;

import java.sql.Date;

public class Post {
Integer id;
String content;
String author;
Date date;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
}
