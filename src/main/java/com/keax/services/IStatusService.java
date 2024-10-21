package com.keax.services;

import java.io.ObjectInputFilter.Status;
import java.util.List;
 

public interface IStatusService {
	public void insertStatus(Status Status);

	public void updateStatus(Status Status);

	public void deleteStatus(int id);

	public List<Status> listStatus();
}
