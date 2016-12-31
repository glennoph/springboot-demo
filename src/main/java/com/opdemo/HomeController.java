package com.opdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@Value("${hello.tgt:opdemo}")
	private String propertyname; 
	
	@RequestMapping("/")
	public String home() {
		return "hi "+ propertyname;
	}
	
}
