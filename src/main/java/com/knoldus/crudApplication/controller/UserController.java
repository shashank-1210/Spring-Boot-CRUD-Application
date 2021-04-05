package com.knoldus.crudApplication.controller;

import com.knoldus.crudApplication.model.User;
import com.knoldus.crudApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

  @Autowired
  private UserService userService;


  @RequestMapping("/create/{id}/{name}/{clg}")
  public String create(@PathVariable int id, @PathVariable String name, @PathVariable String clg) {
	User user = userService.create(id, name, clg);
	return "User is  Created:" + user.toString();
  }

  @RequestMapping("/getall")
  public List<User> getAll() {
	return userService.getAllUsers();
  }

  @RequestMapping("/getbyid/{id}")
  public Optional<User> getById(@PathVariable int id) {
	return userService.getUserById(id);
  }

  @RequestMapping("/update/{id}/{name}/{clg}")
  public String update(@PathVariable int id, @PathVariable String name, @PathVariable String clg) {
	userService.update(id, name, clg);
	return "User Updated";
  }

  @RequestMapping("/deleteall")
  public String deleteAll() {
	userService.deleteAll();
	return "All users deleted.";
  }

  @RequestMapping("/deletebyid/{id}")
  public String delete(@PathVariable int id) {
	userService.deleteById(id);
	return "User Deleted.";
  }

}