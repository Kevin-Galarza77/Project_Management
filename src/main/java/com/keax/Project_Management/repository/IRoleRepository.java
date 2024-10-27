package com.keax.Project_Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keax.Project_Management.model.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {

	public Role findByRoleName(String roleName);
	
	public List<Role> findByRoleStatus(boolean roleStatus);

}
