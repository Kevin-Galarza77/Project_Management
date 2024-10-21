package com.keax.services;

import java.util.List;

import com.keax.model.Task;

public interface ITaskService {
	public void insertTask(Task Task);

	public void updateTask(Task Task);

	public void deleteTask(int id);

	public List<Task> listTask();
}
