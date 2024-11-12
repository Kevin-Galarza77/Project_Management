package com.keax.Project_Management.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.keax.Project_Management.model.Role;
import com.keax.Project_Management.repository.IRoleRepository;
import com.keax.Project_Management.services.IRoleService;

@Service
@Component
public class RoleServiceImp implements IRoleService {

	@Autowired
	private IRoleRepository roleRepository;
	
	@Override
	public void insertRole(Role Role) {
		try {
			roleRepository.save(Role);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateRole(Role Role) {
		try {
			roleRepository.save(Role);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteRole(int id) {
		try {
			roleRepository.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Role> listRole() {
		try {
			return roleRepository.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Role findByRoleName(String roleName) {
		try {
			return roleRepository.findByRoleName(roleName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public List<Role> findByRoleStatus(boolean roleStatus) {
		try {
			return roleRepository.findByRoleStatus(roleStatus);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Optional<Role> findById(int id) {
		try {
			return roleRepository.findById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
