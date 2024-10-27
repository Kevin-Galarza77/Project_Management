package com.keax.Project_Management.services;

import java.sql.Date;
import java.util.List;

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.model.User;

public interface IProjectService {
	public void insertProject(Project Project);

	public void updateProject(Project Project);

	public void deleteProject(int id);

	public List<Project> listProject();
	
	List<Project> findByStatus(Status status);

    List<Project> findByManager(User manager);

    List<Project> findByProjectStartDateAfter(Date startDate);

    List<Project> findByProjectNameContaining(String projectName);
    
    List<Project> findByStatusAndManager(Status status, User manager);
}
