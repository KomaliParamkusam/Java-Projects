package bank;

import java.util.Scanner;

public class BankingApplication extends Thread
{
    void homepage()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("         WELCOME TO BANKING SYSTEM           ");
        
        System.out.println("-------------------------------------------");                
        System.out.println();     
        System.out.println("[NEW USER]  1.Register ");
        System.out.println("[ALREADY AN USER]   2.Login");
        System.out.println("3. Exit");
        System.out.println();
        System.out.println("-------------------------------------------");  
        int choice=sc.nextInt();
        BankService service=new BankService();
        switch (choice) {
            case 1:
                service.registerUser();
                break;
            case 2:
                service.loginholder();
                break;
            case 3:
                System.out.println("-----Exited------");
                break;
            default:
                System.out.println("Enter Valid Choice");
                break;
        }
    }
    
    public static void main(String[] args) throws InterruptedException
    {
        BankingApplication app=new BankingApplication();
        app.homepage();
}
}
 
