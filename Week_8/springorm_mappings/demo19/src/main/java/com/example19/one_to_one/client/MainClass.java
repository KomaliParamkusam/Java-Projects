package com.example19.one_to_one.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example19.one_to_one.daos.IAccountDao;
import com.example19.one_to_one.entities.ProfileSettings;
import com.example19.one_to_one.entities.UserProfile;

public class MainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "com/example19/one_to_one/cfgs/config.xml");
        IAccountDao dao = ctx.getBean("dao", IAccountDao.class);
        UserProfile user = new UserProfile();
        user.setUser_name("Jyothika");
        user.setU_email("jyo@gmail.com");

        ProfileSettings settings = new ProfileSettings();
        settings.setAccount_privacy("private");
        settings.setLanguage_preferences("Tamil");
        settings.setNotifications("Just Once");

        user.setProfile_settings(settings);
       settings.setUser_profile(user); // Maintain bidirectionality

        // System.out.println(dao.createProfile(user)); 
       
        System.out.println(dao.addSettings(settings));// Hibernate will save both due to cascade
        dao.fetch(6);

    }
}
