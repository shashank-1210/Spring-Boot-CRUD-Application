package com.knoldus.crudApplication.service;

import com.knoldus.crudApplication.model.User;
import com.knoldus.crudApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;


  public User create(int id, String name, String college) {
	return userRepository.insert(new User(id, name, college));
  }

  public List<User> getAllUsers() {
	return userRepository.findAll();
  }

  public Optional<User> getUserById(int id) {
	return userRepository.findById(id);
  }

  public User update(int id, String name, String clg) {
	Optional<User> optional = userRepository.findById(id);
	User user = optional.get();
	user.setName(name);
	user.setCollege(clg);
	return userRepository.save(user);
  }

  public void deleteAll() {
	userRepository.deleteAll();
  }

  public void deleteById(int id) {
	userRepository.deleteById(id);
  }


}
