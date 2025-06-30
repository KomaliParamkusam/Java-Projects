package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Account_holderDAO 
{
    
    private Connection con;
    public List<Account_holder> holders=new ArrayList<>();
     Scanner sc=new Scanner(System.in);
    void add_user()
    {
       
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter email: ");
        String email=sc.nextLine();
        Account_holder acc_holder=new Account_holder(email,name);
        int count=0;


        try
        {
            con=DBConnection.setConnection();
            String q="SELECT COUNT(user_name) FROM acc_holder WHERE LOWER(user_name)=LOWER(?)";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setString(1, acc_holder.getUser_name());
            ResultSet r=ps.executeQuery();
            while(r.next())
            {
                count=r.getInt(1);
            }
            if(count==0)
            {
            String query="INSERT INTO acc_holder(user_id,user_name,user_email) VALUES(seq_userid.NEXTVAL,?,?)";
            PreparedStatement pstmnt=con.prepareStatement(query);
            pstmnt.setString(1,acc_holder.getUser_name());
            pstmnt.setString(2, acc_holder.getUser_email());
            pstmnt.executeUpdate();
            String s="SELECT seq_userid.CURRVAL FROM acc_holder";
             PreparedStatement pst=con.prepareStatement(s);
             ResultSet rs = pst.executeQuery();
              if (rs.next()) 
              {
                int custNo = rs.getInt(1);
                System.out.println("User with id  "+ custNo+"  Registered Successfully ");
              }
            rs.close();
            pst.close();
            pstmnt.close();
            r.close();
            ps.close();
            }
            else
            {
                System.out.println("User name already exists Try again");
                add_user();
            }

            
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    void delete_user(int u_id)
    {
        int count=0;
        try
        {
            con=DBConnection.setConnection();
            String q="SELECT COUNT(user_id) FROM acc_holder WHERE user_id=?";
            PreparedStatement ps=con.prepareStatement(q);
             ps.setInt(1, u_id);
            ResultSet r=ps.executeQuery();
        while(r.next())
        {
            count=r.getInt(1);
        }
            if(count==1)
            {
            String query="DELETE FROM acc_holder where user_id=?";
            PreparedStatement pstmnt = con.prepareStatement(query);
                pstmnt.setInt(1,u_id);
                pstmnt.executeUpdate();
            }
            else
            {
                System.out.println("Invalid holder id");
            }
            con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
     boolean login_account()
    {
        System.out.print("Enter your User Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name: ");
        String name=sc.nextLine();
        int check=0,check1=0;
        try
        {
            con=DBConnection.setConnection();
            String q="SELECT COUNT(user_id) FROM acc_holder WHERE user_id=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1, id);
            ResultSet r=ps.executeQuery();
            while(r.next())
            {
                check=r.getInt(1);
            }
            r.close();
            ps.close();
            String q1= "SELECT COUNT(user_name) FROM acc_holder WHERE LOWER(user_name) = LOWER(?)";
             PreparedStatement ps1=con.prepareStatement(q1);
            ps1.setString(1, name);
            ResultSet r1=ps1.executeQuery();
            while(r1.next())
            {
                check1=r1.getInt(1);
            }
            if(check==1 && check1==1)
            {
                 System.out.println("Login Successfuly");
                return true;
            }
           

            r1.close();
           ps1.close();
          
            con.close();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
        
    }
    
    

}
