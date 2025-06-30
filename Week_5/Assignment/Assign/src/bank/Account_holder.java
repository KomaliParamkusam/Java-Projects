package bank;

public class Account_holder 
{
    private int user_id;
    private String user_name;
    private String user_email;

    public Account_holder(String user_email,String user_name) 
    {
        this.user_email = user_email;
        this.user_name = user_name;
    }
    
    public int getUser_id() {
        return user_id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_email() {
        return user_email;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    
}
