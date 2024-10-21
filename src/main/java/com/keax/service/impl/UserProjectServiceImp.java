package com.keax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.keax.model.UserProject; 
import com.keax.repository.IUserProjectRepository;
import com.keax.services.IUserProjectService;

public class UserProjectServiceImp implements IUserProjectService {

	@Autowired
	private IUserProjectRepository userProjectRepository;
	
	@Override
	public void insertUserProject(UserProject UserProject) {
		try {
			userProjectRepository.save(UserProject);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateUserProject(UserProject UserProject) {
		try {
			userProjectRepository.save(UserProject);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteUserProject(int id) {
		try {
			userProjectRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<UserProject> listUserProject() {
		try {
			return userProjectRepository.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	
	
}
