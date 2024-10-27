package com.keax.Project_Management.services;

 
import java.util.List;

import com.keax.Project_Management.model.Status;

public interface IStatusService {
	public void insertStatus(Status Status);

	public void updateStatus(Status Status);

	public void deleteStatus(int id);

	public List<Status> listStatus();

	public Status findByStatusName(String statusName);

	public List<Status> findByStatusStatus(boolean status);

}
