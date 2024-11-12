package com.keax.Project_Management.services;

 
import java.util.List;
import java.util.Optional;

import com.keax.Project_Management.model.Status;

public interface IStatusService {
	public void insertStatus(Status Status);

	public void updateStatus(Status Status);

	public void deleteStatus(int id);

	public List<Status> listStatus();

	public Status findByStatusName(String statusName);
	
	public Optional<Status> findById(int id);

	public List<Status> findByStatusStatus(boolean status);

}
