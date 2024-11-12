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
public class UserController {

	@Autowired
	private IUserService userService;
	@Autowired
	private IRoleService roleService;

	@GetMapping("users")
	public String dashboard(Model model) {
		List<User> userList = userService.findByUserStatus(true);
		model.addAttribute("userList", userList);
		return "users";
	}

	@GetMapping("new-user")
	public String newUSer(Model model) {
		List<Role> roleList = roleService.findByRoleStatus(true);
		User user = new User();
		model.addAttribute("roleList", roleList);
		model.addAttribute("user", user);
		return "newUser";
	}
	
	@PostMapping("newUser")
	public String newOwner(@ModelAttribute("${user}") User user) {
		user.setUserStatus(true);
		userService.insertUser(user);
		return "redirect:/users";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(@ModelAttribute("${user}") User user) { 
	    userService.updateUser(user);  
	    return "redirect:/users"; 
	}

	@GetMapping("/editUser/{id}")
	public String editUser(@PathVariable("id") int userId, Model model) {
	    Optional<User> optional = userService.findById(userId);
	    if (optional.isPresent()) { 
	        model.addAttribute("user", optional.get());
		    List<Role> roleList = roleService.findByRoleStatus(true);
		    model.addAttribute("roleList", roleList);
		    return "newUser";
	    }
		return "redirect:/users";
	}

	@PostMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int userId) {
		Optional<User> optional = userService.findById(userId);
		if (optional.isPresent()) {
			User user = optional.get();
			user.setUserStatus(false);
			userService.updateUser(user);
		} 
		return "redirect:/users";
	}
	
}
