package com.keax.Project_Management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("dashboard")
	public String dashboard() {
		return "index";
	}
	
	@GetMapping("layout-static")
	public String layout_static() {
		return "layout-static";
	}
	
	@GetMapping("layout-sidenav-light")
	public String layout_sidenav_light() {
		return "layout-static";
	}
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
	
	@GetMapping("register")
	public String register() {
		return "register";
	}
	
	@GetMapping("password")
	public String password() {
		return "password";
	}
	
	@GetMapping("401")
	public String e401() {
		return "401";
	}
	
	@GetMapping("404")
	public String e404() {
		return "404";
	}
	
	@GetMapping("500")
	public String e500() {
		return "500";
	}
	
	@GetMapping("charts")
	public String charts() {
		return "charts";
	}
	
	@GetMapping("tables")
	public String tables() {
		return "charts";
	}
	
}
