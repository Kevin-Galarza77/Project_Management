package com.keax.Project_Management.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.model.User;

public interface IProjectRepository extends JpaRepository<Project, Integer> {
	
	List<Project> findByStatus(Status status);

    List<Project> findByManager(User manager);

    List<Project> findByProjectStartDateAfter(Date startDate);

    List<Project> findByProjectNameContaining(String projectName);
    
    List<Project> findByStatusAndManager(Status status, User manager);
    
}
