package bank;

import java.util.Scanner;

public class BankService 
{
    Account_holderDAO holder=new Account_holderDAO();
    AccountsDAO account=new AccountsDAO();
    TransactionsDAO transaction=new TransactionsDAO();
    BankingApplication app=new BankingApplication();
   static Scanner sc=new Scanner(System.in);
    void registerUser()
    {
        
        holder.add_user();
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("1. Create Bank Account");
        System.out.println("2. Back to home");
        System.out.println("------------------------------");
        System.out.println();
        int choice=sc.nextInt();
        if(choice==1)
        {
            account.create_Account();
            transactionspage();
            
        }
        else if(choice==2)
        {
            app.homepage();
        }
        else
        {
            System.out.println("Invalid choice try again...");
            registerUser();

        }
    }
    void loginholder()
    {
        if(holder.login_account())
        {
       
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("i. Create Bank Account");
        System.out.println("ii. View Bank Account");  
        System.out.println("------------------------------");
        System.out.println();
        String ch=sc.next();
        if(ch.equals("i"))
        {
            account.create_Account();
            transactionspage();
        }
        else if(ch.equals("ii"))
        {
            System.out.println("Enter user id: ");
            int i=sc.nextInt();
            sc.nextLine();
            if(account.view_account(i))
            {
                transactionspage();
            }
            else
            {
                System.out.println("No Account with the given Id");
                System.out.println("Create an account");
                account.create_Account();
                transactionspage();

            }
        }
         else
        {
            System.out.println("Invalid choice try again...");
            loginholder();
        }
        }
        else
        {
            System.out.println("User not found");
            app.homepage();
        }
       

    }
    void transactionspage()
    {
        System.out.println("------------------------------");
        System.out.println(); 
        System.out.println("a. Deposite");
        System.out.println("b. Withdraw");
        System.out.println("c. Transfer Funds");
        System.out.println("d. View Transaction History"); 
        System.out.println("e. Check Balance");  
        System.out.println("f. Delete Account");
        System.out.println("g. Delete User");
        System.out.println("h. Home");
        System.out.println("------------------------------");
        System.out.println(); 
        char ch=sc.next().charAt(0);
        if(ch=='a')
        {
            if(transaction.deposite_ammount())
            {
                System.out.println("Amount Deposited Successfully");
                transactionspage();
            }
            else
            {
                System.out.println("Failed Deposition Account Not Found");
                loginholder();
            }

        }
        else if(ch=='b')
        {
            if(transaction.withdraw_ammount())
            {
                System.out.println("Amount Withdrawal Successfully");
            }
            else
            {
                System.out.println("You have insuffient balance");
                transactionspage();
            }

        }
        else if(ch=='c')
        {
            System.out.print("Enter Your Account number: ");
            int fromacc=sc.nextInt();
           sc.nextLine();
           System.out.print("Enter the receivers account number: ");
            int toacc=sc.nextInt();
            sc.nextLine();
            if(transaction.transfer_fund(fromacc,toacc))
            {
                System.out.println("Funds Transfered successfully");
                transactionspage();
            }
            else
            {
                System.out.println("Accounts not found");
                loginholder();
            }
        }
        else if(ch=='d')
        {
            System.out.println("Enter the account number");
            int accnum=sc.nextInt();
            sc.nextLine();
            transaction.transaction_history(accnum);
            transactionspage();

        }
        else if(ch=='e')
        {
            System.out.println("Enter the account number");
            int accnum=sc.nextInt();
            sc.nextLine();
            account.check_Balance(accnum);
            transactionspage();
        }
        else if(ch=='f')
        {
            System.out.println("Enter the Account number to be removed");
            int acid=sc.nextInt();
            account.delete_account(acid);
            System.out.println("Account removed successfully");
            transactionspage();
        }
        else if(ch=='g')
        {
            System.out.println("Enter the Account holder Id to be removed");
            int id=sc.nextInt();
            holder.delete_user(id);
            System.out.println("User Removed Successfully");
             transactionspage();
        }
        else if(ch=='h')
        {
            app.homepage();
        }
        else
        {
            System.out.println("Invalid choice try again");
            transactionspage();
        }
    
    }
  
        
    
}
