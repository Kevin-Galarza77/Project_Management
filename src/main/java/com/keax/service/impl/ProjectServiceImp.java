package com.keax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keax.model.Project; 
import com.keax.repository.IProjectRepository;
import com.keax.services.IProjectService;

@Service
@Component
public class ProjectServiceImp implements IProjectService{

	@Autowired
	private IProjectRepository projectRepository;
	
	@Override
	public void insertProject(Project Project) {
		try {
			projectRepository.save(Project);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void updateProject(Project Project) {
		try {
			projectRepository.save(Project);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteProject(int id) {
		try {
			projectRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Project> listProject() {
		try {
			return projectRepository.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	

}
