package com.keax.Project_Management.controller;

import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keax.Project_Management.model.Role;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.services.IRoleService;
import com.keax.Project_Management.services.IUserService;

@Controller
public class RoleController {

	@Autowired
	private IRoleService roleService;

	@GetMapping("roles")
	public String table(Model model) {
		List<Role> roleList = roleService.findByRoleStatus(true);
		model.addAttribute("roleList", roleList);
		return "roles";
	}

	@GetMapping("new-rol")
	public String newRol(Model model) {
		Role role = new Role();
		model.addAttribute("role", role);
		return "roleForm";
	}
	
	@PostMapping("newRole")
	public String newRole(@ModelAttribute("${role}") Role role) {
		role.setRoleStatus(true);
		roleService.insertRole(role);
		return "redirect:/roles";
	}
	
	@PostMapping("/updateRole")
	public String updateUser(@ModelAttribute("${role}") Role role) { 
	    roleService.updateRole(role);  
	    return "redirect:/roles"; 
	}

	@PostMapping("/deleteRole/{id}")
	public String deleteUser(@PathVariable("id") int roleId) {
		Optional<Role> optional = roleService.findById(roleId);
		if (optional.isPresent()) {
			Role role= optional.get();
			role.setRoleStatus(false);
			roleService.updateRole(role);
		} 
		return "redirect:/roles";
	}
	
	@GetMapping("/editRole/{id}")
	public String editUser(@PathVariable("id") int roleId, Model model) {
		Optional<Role> optional = roleService.findById(roleId);
	    if (optional.isPresent()) { 
	        model.addAttribute("role", optional.get());  
		    return "roleForm";
	    }
		return "redirect:/roles";
	}

}
