package com.example7.beans;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMS implements NotificationService
{

    @Override
    public void sendNotification(String msg) 
    {
        System.out.println("SMS Sent:: "+msg);
    }
    
}
