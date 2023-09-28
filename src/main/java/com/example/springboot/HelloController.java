package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String s = "VMware Explore & SpringOne Singapore";
		return "Greetings from " + s + "!";
	}

}