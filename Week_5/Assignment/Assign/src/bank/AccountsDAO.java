package bank;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Scanner;

public class AccountsDAO 
{
    private Connection con;
    static  Scanner sc=new Scanner(System.in);
    void create_Account() 
    {
    System.out.print("Enter the account type: ");
    String type = sc.next();
    System.out.print("Enter the user id: ");
    int id = sc.nextInt();
    sc.nextLine();
    double bal;
    while (true) 
    { 
        System.out.print("Enter the balance: ");
        bal = sc.nextDouble();
        if(bal<=0)
        {
            System.out.println("Invalid Balance enetered try again");
        }
        else
        {
            break;
        }
    }
    

    Accounts account = new Accounts(id, type, LocalDate.now(), bal);
    int count = 0;
    int c1 = 0;

    try {
        con = DBConnection.setConnection();

        
        String q1 = "SELECT COUNT(user_id) FROM acc_holder WHERE user_id = ?";
        PreparedStatement stmnt = con.prepareStatement(q1);
        stmnt.setInt(1, id);
        ResultSet rs = stmnt.executeQuery();
        if (rs.next()) {
            c1 = rs.getInt(1);
        }
        rs.close();
        stmnt.close();

        
        String q = "SELECT COUNT(user_id) FROM accounts WHERE user_id = ?";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, account.getAcc_holder_id());
        ResultSet r = ps.executeQuery();
        if (r.next()) {
            count = r.getInt(1);
        }
        r.close();
        ps.close();

        if (count >= 2) 
        {
            System.out.println("Limit Exceeded: One user can have only two accounts.");
        } 
        else if (count < 2 && c1 == 1) 
        {
            String query = "INSERT INTO accounts(acc_number, account_type, user_id, acc_balance, acc_creation) VALUES(seq_accnum.NEXTVAL, ?, ?, ?, ?)";
            PreparedStatement pstmnt = con.prepareStatement(query);
            pstmnt.setString(1, account.getAccount_type());
            pstmnt.setInt(2, account.getAcc_holder_id());
            pstmnt.setDouble(3, account.getBalance());
            pstmnt.setDate(4, Date.valueOf(account.getAcc_creation()));
            pstmnt.executeUpdate();
             String s="SELECT seq_accnum.CURRVAL FROM accounts";
             PreparedStatement pst=con.prepareStatement(s);
             ResultSet rt = pst.executeQuery();
              if (rt.next()) 
              {
                int accNo = rt.getInt(1);
                System.out.println(" Account created successfully with account number:  "+accNo);
              }
            rt.close();
            pst.close();
            pstmnt.close();
        } 
        else if (c1 == 0) 
        {
            System.out.println("User not found. Please register. Go back to home.");
            BankingApplication app = new BankingApplication();
            app.homepage();
        }

        con.close();
    } 
    catch (Exception e) 
    {
        e.printStackTrace();
    }
}
   
    void delete_account(int accNo)
    {
        int count=0;
        try
        {
        con=DBConnection.setConnection();
        String q="SELECT COUNT(acc_number) FROM accounts WHERE acc_number=?";
        PreparedStatement ps=con.prepareStatement(q);
        ps.setInt(1, accNo);
        ResultSet r=ps.executeQuery();
        while(r.next())
        {
            count=r.getInt(1);
        }
        if(count==1)
        {
            String query="DELETE FROM accounts where acc_number=?";
            PreparedStatement pstmnt = con.prepareStatement(query);
            pstmnt.setInt(1,accNo);
            pstmnt.executeUpdate();
        }
        else
        {
            System.out.println("Account number " +accNo+ " is invalid");
        }
       }
       catch(Exception e)
       {
        e.printStackTrace();
       }
    

    }
    void check_Balance(int accnum)
    {
        if(TransactionsDAO.validate_account(accnum))
        {
            try
            {
                con=DBConnection.setConnection();
                String query="SELECT acc_balance from accounts where acc_number=?";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setInt(1,accnum);
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                    double bal=rs.getDouble("acc_balance");
                    System.out.println("----------------------------");
                    System.out.println();
                    System.out.println("| Total Balance: "+bal+" |");
                    System.out.println();
                    System.out.println("----------------------------");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Invalid Account Number");
        }
    }
    boolean view_account(int id)
    {
        try
        {
         con=DBConnection.setConnection();
        String q3="SELECT *FROM accounts WHERE user_id=?";
                PreparedStatement p=con.prepareStatement(q3);
                p.setInt(1,id);
                ResultSet rt=p.executeQuery();
                while(rt.next())
                {
                    System.out.println("-------------------------------------------------------------------------------------------"); 
                    System.out.println("|Account Number: "+rt.getString("acc_number")+" |Account Type: "+rt.getString("account_type")+" |User Id: "+rt.getString("user_id")+" |Balance: "+rt.getString("acc_balance")+" |Account Created: "+rt.getString("acc_creation")+"|");
                    System.out.println("-------------------------------------------------------------------------------------------"); 
                    return true;

                }
                rt.close();
                p.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return false;
    }
  

    
}
