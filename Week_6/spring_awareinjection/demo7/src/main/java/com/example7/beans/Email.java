package com.example7.beans;

import org.springframework.stereotype.Component;

@Component("emailService")
public class Email implements NotificationService
{
    
    @Override
    public void sendNotification(String msg) 
    {
        System.out.println("Email Sent:: "+msg);
    }
    
}
