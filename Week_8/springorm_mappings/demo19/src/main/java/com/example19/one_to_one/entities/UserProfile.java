package com.example19.one_to_one.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_profile")
public class UserProfile 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int user_id;
    private String user_name;
    private String u_email;

    @OneToOne(mappedBy="user_profile")
    private ProfileSettings profile;

    public UserProfile() 
    {
    }

    public UserProfile(int user_id, String user_name, String u_email, ProfileSettings profile) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.u_email = u_email;
        this.profile = profile;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public ProfileSettings getProfile_settings() {
        return profile;
    }

    public void setProfile_settings(ProfileSettings profile) {
        this.profile = profile;
    }

    @Override
    public String toString() 
    {
        return "UserProfile [user_id=" + user_id + ", user_name=" + user_name + ", u_email=" + u_email
                + ", profile_settings=" + profile + "]";
    }
    

    

}
