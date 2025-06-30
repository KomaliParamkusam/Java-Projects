package com.example7.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:myfile.properties")
@Component("manager")
public class NotificationManager implements ApplicationContextAware
{
    private ApplicationContext ctx;
    @Value("${notification.type}")
    private String type;
    @Value("${notification.message}")
    private String message;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException 
    {
        this.ctx=applicationContext;
    }
    public void notifyUser()
    {
        // System.out.println(type);
        // System.out.println(message);
        NotificationService ser=null;
        if(type.equalsIgnoreCase("email"))
        {
            ser=ctx.getBean("emailService",Email.class);
        }
        else if(type.equalsIgnoreCase("sms"))
        {
            ser=ctx.getBean("smsService",SMS.class);
        }
        if(ser!=null)
        {
            ser.sendNotification(message);
        }
        else
        {
            System.out.println("No service found");
        }
    }
    
}
