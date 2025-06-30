package com.example.security;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{

	@GetMapping("/")
	@ResponseBody
	public String method()
	{
//		System.out.println("hello");
		return "Authenticated";
	}
    @GetMapping("/home")
    @Secured("ROLE_ADMIN")
    public String homePage() {
        return "home";
    }
}