package com.keax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.keax.model.User;
import com.keax.repository.ITaaskRepository;
import com.keax.repository.IUserRepository;
import com.keax.services.IUserService;

public class UserServiceImp implements IUserService{

	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public void insertUser(User User) {
		try {
			userRepository.save(User);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateUser(User User) {
		try {
			userRepository.save(User);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteUser(int id) {
		try {
			userRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<User> listUser() {
		try {
			return userRepository.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	

}
