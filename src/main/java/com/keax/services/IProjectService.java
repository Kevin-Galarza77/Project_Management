package com.keax.services;

import java.util.List;
 
import com.keax.model.Project;

public interface IProjectService {
	public void insertProject(Project Project);

	public void updateProject(Project Project);

	public void deleteProject(int id);

	public List<Project> listProject();
}
