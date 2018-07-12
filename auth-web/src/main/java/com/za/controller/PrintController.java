package com.za.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrintController {

	@RequestMapping("/temp/add")
	public String addPrintTemplate() {
		System.out.println("----addPrintTemplate----");
		return "redirect:/page/add.html";
	}
	
}
