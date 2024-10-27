package com.keax.Project_Management.services;

import java.util.List;

import com.keax.Project_Management.model.Role;

public interface IRoleService {
	public void insertRole(Role Role);

	public void updateRole(Role Role);

	public void deleteRole(int id);

	public List<Role> listRole();
	
	public Role findByRoleName(String roleName);
	
	public List<Role> findByRoleStatus(boolean roleStatus);
}
