package tracker;

import java.time.YearMonth;
import java.util.HashMap;
import java.util.Scanner;

public class TrackingApplication 
{
    public static void main(String[] args) 
    {
    System.out.println("                 WELCOME TO EMPLOYEE ATTENDANCE TRACKING SYSTEM                 ");
    AttendanceManager manager=new AttendanceManager(new HashMap<>());
    Scanner sc=new Scanner(System.in);
    ReportGenerator reportGenerator = new ReportGenerator();
    
   while (true) 
   { 
       
   
    System.out.println();
    System.out.println("---------------------------------------------------------------------");
    System.out.println();
    System.out.println("........................");
    System.out.println("|1. Add Employee       |");
    System.out.println("........................");
    System.out.println("|2. Check_In           | ");
    System.out.println("........................");
    System.out.println("|3. Check_Out          |");
    System.out.println("........................");
    System.out.println("|4. View Monthly Report|");
    System.out.println("........................");
    System.out.println("|5. Exit               |");
    System.out.println("........................");
    System.out.println();
    System.out.println("----------------------------------------------------------------------");
    int choice=sc.nextInt();
    sc.nextLine();
        switch (choice) 
        {
            case 1:
                System.out.print("Enter the Employee Id: ");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the Employee Name: ");
                String name=sc.next();
                manager.addEmployee(new EmployeeDetails(id, name));
                System.out.println("------Employee added successfully------");
                break;
            case 2:
               
                try 
                {
                    manager.checkIn();
                  
                }
                catch (MultipleCheckInException e)
                {
                    System.out.println("Error: " + e.getMessage());
                }
                catch (Exception e)
                {
                    System.out.println("Invalid time format.");
                }
                break;
            case 3:
              
                try
                {
                    manager.checkOut();
                    
                }
                catch (MissingCheckInException | MultipleCheckOutException e)
                {
                    System.out.println("Error: " + e.getMessage());
                }
                catch (Exception e)
                {
                    System.out.println("Invalid time format.");
                }
                break;
            case 4:
                System.out.print("Enter Employee ID: ");
                int reportId = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Month: ");
                int month= sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Year: ");
                int year=sc.nextInt();
                sc.nextLine();
                try
                {
                    YearMonth monthYear = YearMonth.of(year, month);
                    EmployeeDetails emp = manager.getEmployee(reportId);
                    if (emp != null)
                    {
                        reportGenerator.generateMonthlyReport(emp, monthYear);
                        reportGenerator.readReport();
                    }
                    else 
                    {
                        System.out.println("Employee not found.");
                        
                    }
                }
                catch (Exception e)
                {
                    System.out.println("Invalid month/year format.");
                }
                break;
        case 5:
                System.out.println("Exiting the application.........");
                sc.close();
                return;

            default:
                System.out.println("Invalid option. Please try again.");
        }
   

    }

}
}
