package com.example19.one_to_one.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.example19.one_to_one.entities.ProfileSettings;
import com.example19.one_to_one.entities.UserProfile;

public class AccountDaoImpl implements IAccountDao
 {

    
    private HibernateTemplate ht;

    // @Override
    // @Transactional
    // public String createProfile(UserProfile user) 
    // {
    //     Integer c=(Integer)ht.save(user);
    //     return c==0?"Not Created":"Profile Created";
    // }

    @Override
    @Transactional
    public String addSettings(ProfileSettings settings) 
    {
         Integer c=(Integer)ht.save(settings);
        return c==0?"Settings not modified":"Settings Added";
    }

    @Autowired
    public void setHt(HibernateTemplate ht) 
    {
        this.ht = ht;
    }

    @Override
    public void fetch(int uid) 
    {
        UserProfile u=ht.get(UserProfile.class,uid);
        System.out.println(u);
        System.out.println(u.getProfile_settings());
    }
  
    
}
