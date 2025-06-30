package com.example19.one_to_one.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profile_settings")
public class ProfileSettings 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private int profile_id;
    private String account_privacy;
    private String language_preferences;
    private String notifications;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    private UserProfile user_profile;

    public ProfileSettings() {
    }

    public ProfileSettings(int profile_id, String account_privacy, String language_preferences, String notifications,
            UserProfile user_profile) {
        this.profile_id = profile_id;
        this.account_privacy = account_privacy;
        this.language_preferences = language_preferences;
        this.notifications = notifications;
        this.user_profile = user_profile;
    }

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    public String getAccount_privacy() {
        return account_privacy;
    }

    public void setAccount_privacy(String account_privacy) {
        this.account_privacy = account_privacy;
    }

    public String getLanguage_preferences() {
        return language_preferences;
    }

    public void setLanguage_preferences(String language_preferences) {
        this.language_preferences = language_preferences;
    }

    public String getNotifications() {
        return notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    public UserProfile getUser_profile() {
        return user_profile;
    }

    public void setUser_profile(UserProfile user_profile) {
        this.user_profile = user_profile;
    }

    @Override
    public String toString() 
    {
        return "ProfileSettings [profile_id=" + profile_id + ", account_privacy=" + account_privacy
                + ", language_preferences=" + language_preferences + ", notifications=" + notifications
                + ", user_profile=" + user_profile + "]";
    }
    



    
}
