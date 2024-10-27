package com.keax.Project_Management.services;

import java.sql.Date;
import java.util.List;

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.model.Task;
import com.keax.Project_Management.model.User;

public interface ITaskService {
	public void insertTask(Task Task);

	public void updateTask(Task Task);

	public void deleteTask(int id);

	public List<Task> listTask();

	List<Task> findByAssignedTo(User assignedTo);

	List<Task> findByProject(Project project);

	List<Task> findByTaskCreationDate(Date taskCreationDate);

	List<Task> findByTaskDueDate(Date taskDueDate);

	List<Task> findByStatus(Status status);
}
