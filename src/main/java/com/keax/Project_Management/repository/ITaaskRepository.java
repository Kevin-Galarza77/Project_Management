package com.keax.Project_Management.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.model.Task;
import com.keax.Project_Management.model.User;

public interface ITaaskRepository extends JpaRepository<Task, Integer> {

	List<Task> findByAssignedTo(User assignedTo);

	List<Task> findByProject(Project project);

	List<Task> findByTaskCreationDate(Date taskCreationDate);

	List<Task> findByTaskDueDate(Date taskDueDate);

	List<Task> findByStatus(Status status);
}
