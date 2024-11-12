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

import com.keax.Project_Management.model.Project;
import com.keax.Project_Management.model.Role;
import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.services.IProjectService;
import com.keax.Project_Management.services.IRoleService;
import com.keax.Project_Management.services.IStatusService;
import com.keax.Project_Management.services.IUserService;

@Controller
public class ProjectController {

	@Autowired
	private IProjectService projectService;
	@Autowired
	private IUserService userService;
	@Autowired
	private IStatusService statusService;

	@GetMapping("projects")
	public String table(Model model) {
		List<Project> projectList = projectService.findByProjectStatus(true);
		model.addAttribute("projectList", projectList);
		return "projects";
	}
	
	@PostMapping("/deleteProject/{id}")
	public String delete(@PathVariable("id") int projectId) {
		Optional<Project> optional = projectService.findById(projectId);
		if (optional.isPresent()) {
			Project project = optional.get();
			project.setProjectStatus(false);
			projectService.updateProject(project);
		}
		return "redirect:/projects";
	}
	
	@GetMapping("new-project")
	public String newProject(Model model) {
		Project project = new Project();
		List<User> userList = userService.findByUserStatus(true);
		List<Status> statusList = statusService.findByStatusStatus(true);
		model.addAttribute("project", project);
		model.addAttribute("userList", userList);
		model.addAttribute("statusList", statusList);
		return "projectForm";
	}
	
	@PostMapping("newProject")
	public String newProject(@ModelAttribute("${project}") Project project) {
		project.setProjectStatus(true); 
		projectService.insertProject(project);
		return "redirect:/projects";
	}
	
	@GetMapping("/editProject/{id}")
	public String editProject(@PathVariable("id") int projectId, Model model) {
		Optional<Project> optional = projectService.findById(projectId);
		if (optional.isPresent()) {
			List<User> userList = userService.findByUserStatus(true);
			List<Status> statusList = statusService.findByStatusStatus(true); 
			Project project = optional.get();
			model.addAttribute("project", project);
			model.addAttribute("userList", userList);
			model.addAttribute("statusList", statusList);
			return "projectForm";
		}
		return "redirect:/projects";
	}
	
	@PostMapping("/updateProject")
	public String updateProject(@ModelAttribute("${project}") Project project) {
		projectService.updateProject(project);
		return "redirect:/projects";
	} 
	
}
