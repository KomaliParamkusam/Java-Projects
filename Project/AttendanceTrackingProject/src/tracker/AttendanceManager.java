package tracker;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

public class AttendanceManager 
{
    private Map<Integer,EmployeeDetails> employeeMap;
    static Scanner sc=new Scanner(System.in);
     DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    int y,m,d;
    public AttendanceManager(Map<Integer, EmployeeDetails> employeeMap) 
    {
        this.employeeMap = employeeMap;
    }
    public void addEmployee(EmployeeDetails emp)
    {
        employeeMap.put(emp.getEmp_id(), emp);
    }
    public EmployeeDetails getEmployee(int eid)
    {
        return employeeMap.get(eid);
    }
    public void checkIn() throws MultipleCheckInException 
    {
               System.out.print("Enter Employee ID: ");
                int checkInId = sc.nextInt();
                sc.nextLine();
                EmployeeDetails emp = employeeMap.get(checkInId);
                if (emp == null) 
                {
                    System.out.println("Employee not found.");
                    return;
                }
                else
                {
                System.out.print("Enter Check-In Time: ");
                String checkInStr = sc.nextLine();
                LocalTime time = LocalTime.parse(checkInStr, timeFormatter);
      
       
        while (true) 
        { 
        
        System.out.println("Enter Year: ");
        y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Month: ");
        m=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Date");
        d=sc.nextInt();
        sc.nextLine();
       
        LocalDate today = validate(y, m, d);
        if(today==null)
        {
            continue;
        }
        else
        {
        Attendance attendance = emp.getAttendanceByDate(today);
        if (attendance == null) 
        {
            attendance = new Attendance(today);
            attendance.setCheckIn(time);
            emp.addAttendance(attendance);
            System.out.println("--------Check-In recorded successfully-------");
        } 
        else 
        {
            if (attendance.getCheckIn() != null) 
            {
                throw new MultipleCheckInException("Check-in already recorded for today.");
            }
            attendance.setCheckIn(time);
        }
        break;
        }
    }
}
  }
    
    public void checkOut() throws MissingCheckInException, MultipleCheckOutException 
    {
        System.out.print("Enter Employee ID: ");
        int checkOutId = sc.nextInt();
        sc.nextLine();
        EmployeeDetails emp = employeeMap.get(checkOutId);
        if (emp == null) 
        {
            System.out.println("Employee not found.");
            return;
        }
        else
        {
        System.out.print("Enter Check-Out Time :  ");
        String checkOutStr = sc.nextLine();
        LocalTime time = LocalTime.parse(checkOutStr, timeFormatter);
         LocalDate today = validate(y, m, d);
         Attendance attendance = emp.getAttendanceByDate(today);
        if (attendance == null || attendance.getCheckIn() == null) 
        {
            throw new MissingCheckInException("Check-in not recorded for today.");
        }
        if (attendance.getCheckOut() != null) 
        {
            throw new MultipleCheckOutException("Check-out already recorded for today.");
        }
        attendance.setCheckOut(time);
        System.out.println("----------Check-Out recorded successfully----------");

        }
    }
    public LocalDate validate(int y,int m,int d)
    {
        YearMonth inputYearMonth = YearMonth.of(y, m);
        YearMonth currentYearMonth = YearMonth.now();
        if(inputYearMonth.isAfter(currentYearMonth))
        {
            System.out.println(" Year and month are not Applicable ");
            System.out.println("Try Again.....");
            return null;
        }
        return LocalDate.of(y, m, d);
       
    }
}
