package com.keax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keax.model.Task; 
import com.keax.repository.ITaaskRepository;
import com.keax.services.ITaskService;

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

	
	
	
}
