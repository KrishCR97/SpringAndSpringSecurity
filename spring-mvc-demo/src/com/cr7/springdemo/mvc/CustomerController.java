package com.cr7.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}
