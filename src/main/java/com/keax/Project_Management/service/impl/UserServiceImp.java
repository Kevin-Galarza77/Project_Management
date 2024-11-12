package com.keax.Project_Management.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keax.Project_Management.model.Role;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.repository.IUserRepository;
import com.keax.Project_Management.services.IUserService;

@Service
@Component
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

	@Override
	public User findByUserEmail(String userEmail) {
		try {
			return userRepository.findByUserEmail(userEmail);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<User> findByUserFirstName(String firstName) {
		try {
			return userRepository.findByUserFirstName(firstName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<User> findByUserLastName(String userLastName) {
		try {
			return userRepository.findByUserLastName(userLastName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<User> findByRole(Role role) {
		try {
			return userRepository.findByRole(role);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<User> findByUserFirstNameContaining(String firstName) {
		try {
			return userRepository.findByUserFirstNameContaining(firstName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<User> findByUserStatus(boolean userStatus) {
		try {
			return userRepository.findByUserStatus(userStatus);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Optional<User> findById(int id) {
		try {
			return userRepository.findById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	

}
