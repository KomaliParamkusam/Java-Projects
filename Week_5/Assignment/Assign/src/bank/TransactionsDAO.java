package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TransactionsDAO 
{
    static Connection con;
    static  Scanner sc=new Scanner(System.in);
     String dtype;
    String wtype;
    double balance;
    double checkbal;
    boolean deposite_ammount()
    {
       
        dtype="deposite";
        while (true) 
        { 
            
        
        System.out.println("Enter the Balance to be transact ");
        balance=sc.nextDouble();
        if(balance<=0)
        {
            System.out.println("Invalid Balance try again");
            
        }
        else
        {
            System.out.print("Enter account number:");
            int accno=sc.nextInt();
            sc.nextLine();
       if(validate_account(accno))
        {
          Transactions trans=new Transactions(dtype, accno,LocalDateTime.now(), balance);
        try
        {
            con=DBConnection.setConnection();
            String query = "INSERT INTO transactions(transaction_id, transaction_type, trans_balance, transaction_date,acc_number) VALUES(seq_transid.NEXTVAL, ?, ?, ?, ?)";
            PreparedStatement pstmnt = con.prepareStatement(query);
            pstmnt.setString(1, trans.getTrans_type());
            pstmnt.setDouble(2, trans.getTrans_balance());
            pstmnt.setTimestamp(3, Timestamp.valueOf(trans.getTrans_Date()));
            pstmnt.setInt(4, trans.getAcc_num());
            pstmnt.executeUpdate();
            String q="UPDATE accounts set acc_balance=acc_balance+? where acc_number=?";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setDouble(1,balance);
            ps.setInt(2,accno);
            ps.executeUpdate();
            pstmnt.close();
            ps.close();
            con.close();
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    }
    break;
}
    
       return false;
    
}
boolean withdraw_ammount()
{
      
        wtype="withdraw";
        System.out.print("Enter account number:");
        int accno=sc.nextInt();
        sc.nextLine();
        if(validate_account(accno))
        {
        System.out.print("Enter the Balance to be transact:");
        balance=sc.nextDouble();
        try
        {
            
            String q="SELECT acc_balance from accounts where acc_number=?";
            con=DBConnection.setConnection();
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,accno);
            ResultSet res=ps.executeQuery();
            while(res.next())
            {
                checkbal=res.getInt("acc_balance");
            }
            res.close();
            ps.close();
            if(checkbal>=balance)
            {
                Transactions trans=new Transactions(wtype, accno,LocalDateTime.now(), balance);
                String query = "INSERT INTO transactions(transaction_id, transaction_type, trans_balance, transaction_date,acc_number) VALUES(seq_transid.NEXTVAL, ?, ?, ?, ?)";
                PreparedStatement pstmnt = con.prepareStatement(query);
                pstmnt.setString(1, trans.getTrans_type());
                pstmnt.setDouble(2, trans.getTrans_balance());
                pstmnt.setTimestamp(3, Timestamp.valueOf(trans.getTrans_Date()));
                pstmnt.setInt(4, trans.getAcc_num());
                pstmnt.executeUpdate();
                String qry="UPDATE accounts set acc_balance=acc_balance-? where acc_number=?";
                PreparedStatement pst=con.prepareStatement(qry);
                pst.setDouble(1,balance);
                pst.setInt(2,accno);
                pst.executeUpdate();
                pst.close();
                con.close();
                return true;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    return false;
}
boolean transfer_fund(int fromacc, int toacc) 
{
   // int f=fromacc,t=toacc;
    if (validate_account(fromacc) && validate_account(toacc)) 
    {
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        if (amount <= 0) 
        {
            System.out.println("Invalid amount entered.");
            transfer_fund(fromacc, toacc);
        }

        try 
        {
            con = DBConnection.setConnection();
            con.setAutoCommit(false); 

            String checkBalanceSQL = "SELECT acc_balance FROM accounts WHERE acc_number = ?";
            PreparedStatement checkStmt = con.prepareStatement(checkBalanceSQL);
            checkStmt.setInt(1, fromacc);
            ResultSet rs = checkStmt.executeQuery();
            double senderBalance = 0;
            if (rs.next()) 
            {
                senderBalance = rs.getDouble("acc_balance");
            }
            rs.close();
            checkStmt.close();

            if (senderBalance < amount) 
            {
                System.out.println("Insufficient balance.");
                con.rollback();
               transfer_fund(fromacc, toacc);
            }
            String withdrawSQL = "UPDATE accounts SET acc_balance = acc_balance - ? WHERE acc_number = ?";
            PreparedStatement withdrawStmt = con.prepareStatement(withdrawSQL);
            withdrawStmt.setDouble(1, amount);
            withdrawStmt.setInt(2, fromacc);
            withdrawStmt.executeUpdate();

            String withdrawTxnSQL = "INSERT INTO transactions(transaction_id, transaction_type, trans_balance, transaction_date, acc_number) VALUES(seq_transid.NEXTVAL, ?, ?, ?, ?)";
            PreparedStatement withdrawTxnStmt = con.prepareStatement(withdrawTxnSQL);
            withdrawTxnStmt.setString(1, "Transfer-Withdraw");
            withdrawTxnStmt.setDouble(2, amount);
            withdrawTxnStmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            withdrawTxnStmt.setInt(4, fromacc);
            withdrawTxnStmt.executeUpdate();

            String depositSQL = "UPDATE accounts SET acc_balance = acc_balance + ? WHERE acc_number = ?";
            PreparedStatement depositStmt = con.prepareStatement(depositSQL);
            depositStmt.setDouble(1, amount);
            depositStmt.setInt(2, toacc);
            depositStmt.executeUpdate();

            
            String depositTxnSQL = "INSERT INTO transactions(transaction_id, transaction_type, trans_balance, transaction_date, acc_number) VALUES(seq_transid.NEXTVAL, ?, ?, ?, ?)";
            PreparedStatement depositTxnStmt = con.prepareStatement(depositTxnSQL);
            depositTxnStmt.setString(1, "Transfer-Deposit");
            depositTxnStmt.setDouble(2, amount);
            depositTxnStmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            depositTxnStmt.setInt(4, toacc);
            depositTxnStmt.executeUpdate();

           
            con.commit();
            con.setAutoCommit(true);
            withdrawStmt.close();
            withdrawTxnStmt.close();
            depositStmt.close();
            depositTxnStmt.close();
            con.close();

          
            return true;

        } 
        catch (SQLException e) 
        {
            try 
            {
                if (con != null) con.rollback();
            } 
            catch (SQLException rollbackEx) 
            {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
        }
    } 
   

    return false;
}
void transaction_history(int accnum)
{
    if(validate_account(accnum))
    {
        try
        {
            con=DBConnection.setConnection();
            String q="SELECT ah.user_id,ah.user_name,a.acc_number,t.transaction_id,t.transaction_type,t.trans_balance,t.transaction_date  FROM  transactions t JOIN accounts a ON t.acc_number = a.acc_number JOIN acc_holder ah ON a.user_id = ah.user_id WHERE a.acc_number = ? ORDER BY t.transaction_date DESC";
            PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1, accnum);
            ResultSet rs = ps.executeQuery();
            boolean hasRecords=false;
            while(rs.next())
            {
                hasRecords=true;
                int userId = rs.getInt("user_id");
                String userName = rs.getString("user_name");
                int accNum = rs.getInt("acc_number");
                int transId = rs.getInt("transaction_id");
                String transType = rs.getString("transaction_type");
                double transBalance = rs.getDouble("trans_balance");
                Timestamp transDate = rs.getTimestamp("transaction_date");
              
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("| User Id: "+userId+" | User Name: "+userName+" | Account Number: "+accNum+" | Transaction Id: "+transId+" | Transaction Type: "+transType+" | Transaction Balance: "+transBalance+" | Date&Time: "+transDate);
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
               
               
            }
            if (!hasRecords)
            {
                System.out.println("No transactions found for Account Number: " + accnum);
            }
        
        }
       catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    else
    {
        System.out.println("Invalid Account Number");
    }
}

   static boolean validate_account(int accnum)
    {
       
        int count=0;
        try
        {
        con=DBConnection.setConnection();
        String q="SELECT COUNT(acc_number) FROM accounts WHERE acc_number=?";
        PreparedStatement ps=con.prepareStatement(q);
        ps.setInt(1, accnum);
        ResultSet r=ps.executeQuery();
        while(r.next())
        {
            count=r.getInt(1);
        }
        if(count==1)
        {
            return true;
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Invalid Account Number");
       return false;
    }
}
