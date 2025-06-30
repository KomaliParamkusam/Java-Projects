package springSecurityDemo.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SecurityController 
{
	

	@GetMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome! You are authenticated.";
	}

	@GetMapping("/admin")
	
	public String adminPage() 
    {
		return "admin";
	}

	@GetMapping("/user")
	public String userPage() 
	{
		return "user";
	}
}
