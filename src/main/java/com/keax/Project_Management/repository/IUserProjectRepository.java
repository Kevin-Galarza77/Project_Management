package com.keax.Project_Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.model.UserProject;

public interface IUserProjectRepository extends JpaRepository<UserProject, Integer> {

	List<UserProject> findByUser(User user);

	List<UserProject> findByProject(Project project);

	List<UserProject> findByUserProjectStatus(boolean userProjectStatus);
}
