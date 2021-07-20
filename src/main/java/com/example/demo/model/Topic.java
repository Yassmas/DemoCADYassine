package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Topic {
private Integer id;
private  String title;
private List<Post> listPost = new ArrayList <Post> ();


public List<Post> getListPost() {
	return listPost;
}
public void setListPost(List<Post> listPost) {
	this.listPost = listPost;
}
public Integer getId() {
	
	return id;



}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

}
