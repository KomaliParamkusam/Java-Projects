package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BootController 
{
	@GetMapping("/greet")
	public String greet()
	{
		return "greet";
	}
}
