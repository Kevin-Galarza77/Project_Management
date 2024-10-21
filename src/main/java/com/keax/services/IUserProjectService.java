package com.keax.services;

import java.util.List;

import com.keax.model.UserProject;

public interface IUserProjectService {
	public void insertUserProject(UserProject UserProject);

	public void updateUserProject(UserProject UserProject);

	public void deleteUserProject(int id);

	public List<UserProject> listUserProject();
}
