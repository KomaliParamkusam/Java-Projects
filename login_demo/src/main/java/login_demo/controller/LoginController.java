package login_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import login_demo.service.LoginService;

@Controller

 @SessionAttributes("name")
  public class LoginController 
{
	@Autowired
	private LoginService service;
	@RequestMapping(value="/login")
	public String loginMethod()
	{
		return "login";
	}
	@RequestMapping(value="/wish")
	public String helloMethod(@RequestParam String name,@RequestParam String password,Model model)
	{
		
		if((name.isEmpty() || name.isEmpty()))
		{
			model.addAttribute("errormessage", "Invalid Name/Password");
			return "login";
		}
		model.addAttribute("name", name);
		return "wish";
	}
	@RequestMapping(value="/welcome")
	public String welcomeMethod(@SessionAttribute String name,Model model)
	{
		model.addAttribute("name", name);
		return "welcome";
	}

}























