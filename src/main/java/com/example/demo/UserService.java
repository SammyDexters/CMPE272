package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List getAllUsers() {

		List users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	public Users getUsers(String id) {
		return userRepository.findById(id).orElse(null);

	}

	public void addUsers(Users user) {
		userRepository.save(user);
	}

	public void updateUsers(Long id, Users user) {
		userRepository.save(user);
	}

	public void deleteUsers(String id) {
		userRepository.deleteById(id);
		
	}

}
