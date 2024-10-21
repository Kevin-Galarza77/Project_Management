package com.keax.services;

import java.util.List;
 
import com.keax.model.Role;

public interface IRoleService {
	public void insertRole(Role Role);

	public void updateRole(Role Role);

	public void deleteRole(int id);

	public List<Role> listRole();
}
