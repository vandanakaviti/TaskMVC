package com.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {
	
	@RequestMapping("/vandana")
	public String vandana() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "sopra";
	}
}
