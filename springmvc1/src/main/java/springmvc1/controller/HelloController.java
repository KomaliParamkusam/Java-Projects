package springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{
	@RequestMapping("/wish")
	@ResponseBody
//	public ModelAndView helloMethod()
//	{
//		ModelAndView mv=new ModelAndView("hello");
//		mv.addObject("message", "Hello Spring Mvc Welocome to Project");
//		return mv;
//	}
	public String helloMethod()
	{
		return "Hellow Springggssss"; 
	}
}