package com.keax.Project_Management.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keax.Project_Management.model.Status;
 

public interface IStatusRepository extends JpaRepository<Status, Integer> {
	
	public Status findByStatusName(String statusName); 
	
	public List<Status> findByStatusStatus(boolean status);
	
}
