package com.knoldus.crudApplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {

  @Id
  private int id;
  private String name;
  private String college;

  public User(int id, String name, String college) {

	this.id = id;
	this.name = name;
	this.college = college;
  }

  public int getId() {
	return id;
  }

  public void setId(int id) {
	this.id = id;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getCollege() {
	return college;
  }

  public void setCollege(String college) {
	this.college = college;
  }

  @Override
  public String toString() {
	return "User{" +
		"id=" + id +
		", name='" + name + '\'' +
		", college='" + college + '\'' +
		'}';
  }
}