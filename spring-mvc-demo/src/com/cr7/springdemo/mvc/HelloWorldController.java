package com.cr7.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	private String processForm(@RequestParam("studentName") String name,Model model) {
        String data = name;
        model.addAttribute("message", "Yo!!" + data.toUpperCase());
		return "helloworld";
	}
}
