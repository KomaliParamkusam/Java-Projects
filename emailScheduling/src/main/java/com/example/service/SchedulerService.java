package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService 
{

  
    private EmailService emailService;
    
    @Autowired
    public SchedulerService(EmailService emailService) 
    {
		
		this.emailService = emailService;
	}

	// Runs every 30 seconds (for demo)
    @Scheduled(cron = "0/30 * * * * *")
    public void sendDailyEmails() 
    {
        System.out.println("Executing scheduled task: Sending email...");
        emailService.sendReminderEmail(
            "monikaemmaneni2@gmail.com",
            "Daily Reminder",
            "Hello! This is your daily reminder from Spring Boot."
        );
    }

  
}
