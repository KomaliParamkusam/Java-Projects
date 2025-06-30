package com.example19.one_to_one.daos;

import com.example19.one_to_one.entities.ProfileSettings;

public interface IAccountDao
{
   // public String createProfile(UserProfile user);
    public String addSettings(ProfileSettings settings);
    public void fetch(int uid);
    

}
