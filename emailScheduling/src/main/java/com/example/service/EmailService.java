package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService 
{

    
    private JavaMailSender mailSender;
    @Autowired
    public EmailService(JavaMailSender mailSender)
    {
    	this.mailSender=mailSender;
    }

    public void sendReminderEmail(String to, String subject, String body) 
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("komalip802@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
        System.out.println("Email sent to " + to);
    }
}
