package jobApplicationMgmntSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import jobApplicationMgmntSystem.entity.JobApplication;
import jobApplicationMgmntSystem.service.JobAppService;
 
@Controller
public class JobAppController 
{
	@Autowired
	private JobAppService service;
 
	@GetMapping("/form")
	public String formMethod(Model model) {

		model.addAttribute("application", new JobApplication());
		return "application-form";
	}
 
	@PostMapping("/save")
	public String saveMethod(@ModelAttribute("application") JobApplication application,Model model) 
	{
		if(application.getId()==0 || application.getFirstName().equals("") || application.getEmail().equals("") || application.getPosition().equals(""))
		{
			model.addAttribute("error","Invalid Credentials");
			return "application-form";
		}
		service.saveJobApplication(application);
		return "redirect:/list";
	}
 
	@GetMapping("/list")
	public String viewApplications(Model model) 
	{
		List<JobApplication> applications = service.getAllApplications();
		model.addAttribute("applicationsList", applications);
		return "application-list";
	}
	@GetMapping("/delete")
	public String deleteApplication(@RequestParam("id") Integer id) 
	{
	    if (id != null) 
	    {
	        service.delete(id);
	    }
	    return "redirect:/list";
	}


}