package com.keax.Project_Management.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.repository.IProjectRepository;
import com.keax.Project_Management.services.IProjectService;

@Service
@Component
public class ProjectServiceImp implements IProjectService {

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

	@Override
	public List<Project> findByStatus(Status status) {
		try {
			return projectRepository.findByStatus(status);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Project> findByManager(User manager) {
		try {
			return projectRepository.findByManager(manager);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Project> findByProjectStartDateAfter(Date startDate) {
		try {
			return projectRepository.findByProjectStartDateAfter(startDate);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Project> findByProjectNameContaining(String projectName) {
		try {
			return projectRepository.findByProjectNameContaining(projectName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Project> findByStatusAndManager(Status status, User manager) {
		try {
			return projectRepository.findByStatusAndManager(status, manager);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
