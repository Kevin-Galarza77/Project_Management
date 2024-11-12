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
import com.keax.Project_Management.model.Status;
import com.keax.Project_Management.model.User;
import com.keax.Project_Management.services.IRoleService;
import com.keax.Project_Management.services.IStatusService;
import com.keax.Project_Management.services.IUserService;

@Controller
public class StatusesController {

	@Autowired
	private IStatusService statusService;

	@GetMapping("statuses")
	public String table(Model model) {
		List<Status> statusList = statusService.findByStatusStatus(true);
		model.addAttribute("statusList", statusList);
		return "statuses";
	}

	@PostMapping("/deleteStatus/{id}")
	public String delete(@PathVariable("id") int statusId) {
		Optional<Status> optional = statusService.findById(statusId);
		if (optional.isPresent()) {
			Status status = optional.get();
			status.setStatusStatus(false);
			statusService.updateStatus(status);
		}
		return "redirect:/statuses";
	}

	@GetMapping("new-status")
	public String newRol(Model model) {
		Status status = new Status();
		model.addAttribute("status", status);
		return "statusForm";
	}

	@PostMapping("newStatus")
	public String newStatus(@ModelAttribute("${status}") Status status) {
		status.setStatusStatus(true);
		statusService.insertStatus(status);
		return "redirect:/statuses";
	}

	@GetMapping("/editStatus/{id}")
	public String editStatus(@PathVariable("id") int statusId, Model model) {
		Optional<Status> optional = statusService.findById(statusId);
		if (optional.isPresent()) {
			model.addAttribute("status", optional.get());
			return "statusForm";
		}
		return "redirect:/roles";
	}

	@PostMapping("/updateStatus")
	public String updateUser(@ModelAttribute("${status}") Status status) {
		statusService.updateStatus(status);
		return "redirect:/roles";
	}
	
}
