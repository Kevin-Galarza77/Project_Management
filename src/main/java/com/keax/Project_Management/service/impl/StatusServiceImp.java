package com.keax.Project_Management.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.repository.IStatusRepository; 
import com.keax.Project_Management.services.IStatusService;


@Service
@Component
public class StatusServiceImp implements IStatusService {

	@Autowired
	private IStatusRepository statusRepository;
	
	@Override
	public void insertStatus(Status Status) {
		try {
			statusRepository.save(Status);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateStatus(Status Status) {
		try {
			statusRepository.save(Status);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteStatus(int id) {
		try {
			statusRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Status> listStatus() {
		try {
			return statusRepository.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Status findByStatusName(String statusName) {
		try {
			return statusRepository.findByStatusName(statusName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Status> findByStatusStatus(boolean status) {
		try {
			return statusRepository.findByStatusStatus(status);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Optional<Status> findById(int id) {
		try {
			return statusRepository.findById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	
	
}
