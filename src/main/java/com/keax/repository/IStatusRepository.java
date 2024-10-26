package com.keax.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.keax.model.Status;
 

public interface IStatusRepository extends JpaRepository<Status, Integer> {
	
	public Status findByStatusName(String statusName); 
}
