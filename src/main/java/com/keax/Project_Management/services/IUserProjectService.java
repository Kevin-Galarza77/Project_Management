package com.keax.Project_Management.services;

import java.util.List;

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.model.UserProject;

public interface IUserProjectService {
	public void insertUserProject(UserProject UserProject);

	public void updateUserProject(UserProject UserProject);

	public void deleteUserProject(int id);

	public List<UserProject> listUserProject();
	
	List<UserProject> findByUser(User user);

	List<UserProject> findByProject(Project project);

	List<UserProject> findByUserProjectStatus(boolean userProjectStatus);
}
