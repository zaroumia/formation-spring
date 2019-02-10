package fr.zaroumia.formation.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";

	@RequestMapping("/hello")
	public String sayHello(@RequestParam final String name, final Model model) {
		model.addAttribute("name", name);
		return "sayHello";
	}
}
