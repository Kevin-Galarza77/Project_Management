package com.keax.Project_Management.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.model.Task;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.repository.ITaaskRepository;
import com.keax.Project_Management.services.ITaskService;

@Service
@Component
public class TaskServiceImp implements ITaskService{

	@Autowired
	private ITaaskRepository taskTaaskRepository;
	
	@Override
	public void insertTask(Task Task) {
		try {
			taskTaaskRepository.save(Task);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateTask(Task Task) {
		try {
			taskTaaskRepository.save(Task);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}

	@Override
	public void deleteTask(int id) {
		try {
			taskTaaskRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Task> listTask() {
		try {
			return taskTaaskRepository.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Task> findByAssignedTo(User assignedTo) {
		try {
			return taskTaaskRepository.findByAssignedTo(assignedTo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Task> findByProject(Project project) {
		try {
			return taskTaaskRepository.findByProject(project);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Task> findByTaskCreationDate(Date taskCreationDate) {
		try {
			return taskTaaskRepository.findByTaskCreationDate(taskCreationDate);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Task> findByTaskDueDate(Date taskDueDate) {
		try {
			return taskTaaskRepository.findByTaskDueDate(taskDueDate);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Task> findByStatus(Status status) {
		try {
			return taskTaaskRepository.findByStatus(status);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	
	
	
}
