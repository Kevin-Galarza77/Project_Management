package com.keax.Project_Management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.model.UserProject;
import com.keax.Project_Management.repository.IUserProjectRepository;
import com.keax.Project_Management.services.IUserProjectService;

@Service
@Component
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

	@Override
	public List<UserProject> findByUser(User user) {
		try {
			return userProjectRepository.findByUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<UserProject> findByProject(Project project) {
		try {
			return userProjectRepository.findByProject(project);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<UserProject> findByUserProjectStatus(boolean userProjectStatus) {
		try {
			return userProjectRepository.findByUserProjectStatus(userProjectStatus);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	
	
}
