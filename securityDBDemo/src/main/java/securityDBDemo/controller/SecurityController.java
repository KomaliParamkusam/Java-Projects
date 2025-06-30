package securityDBDemo.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SecurityController 
{
	

	@GetMapping("/")
	@ResponseBody
	public String welcome() 
	{
		return "Welcome! You are authenticated.";
	}

	@GetMapping("/hr")
    public String adminPage() 
    {
		return "hr";
	}

	@GetMapping("/profile")
	public String userPage() 
	{
		return "profile";
	}
	
	@GetMapping("/manage")
	public String manage()
	{
		return "manage";
	}
	@GetMapping("/employees")
	
	public String showEmployees(Model model) 
	{
	        Map<String,String> emp=new HashMap<>();
	        emp.put("Komali", "Dev");
	        emp.put("Navya", "Java Dev");
	        model.addAttribute("names", emp);
	        return "employee-list";
	 }
	

	
}

