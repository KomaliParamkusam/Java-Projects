package tracker;

import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReportGenerator {
    private static final String REPORT_FILE = "Attendance_Report.txt";

    public void generateMonthlyReport(EmployeeDetails employee, YearMonth month) 
    {
        List<Attendance> records = employee.getAttendanceList();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(REPORT_FILE, true))) 
        {
            writer.write("---------Monthly Attendance Report for " + employee.getEmp_name().toUpperCase() + " of (ID: " + employee.getEmp_id() + ")----------\n");
            writer.write("-----------------------------------------------------\n");
            writer.write("Date        | Check-In    | Check-Out    | Hours Worked\n");
            writer.write("-----------------------------------------------------\n");

            for (Attendance at : records) 
            {
                LocalDate attDate = at.getDate();
                int attMonth = attDate.getMonthValue();
                int attYear = attDate.getYear();
                if (attMonth == month.getMonthValue() && attYear == month.getYear()) 
                {
                    String date = attDate.format(dateFormatter);
                    String checkIn;
                    if(at.getCheckIn() != null) 
                    { 
                        checkIn=at.getCheckIn().toString();
                    }
                    else
                    {
                        checkIn="Not Recorded";
                    }
                    String checkOut;
                    if(at.getCheckOut() != null) 
                    { 
                        checkOut=at.getCheckOut().toString();
                    }
                    else
                    {
                        checkOut="Not Recorded";
                    }
                    String hoursWorked;
                    if (at.getCheckIn() != null && at.getCheckOut() != null) 
                    {
                        Duration d = at.getworkDuration(at.getCheckIn(), at.getCheckOut());
                        long hr = d.toHours();
                        long min = d.toMinutes() % 60;
                        hoursWorked = hr + " Hours : " + min + " Minutes";
                    } 
                    else 
                    {
                        hoursWorked = "Absent";
                    }

                    writer.write(String.format("%s | %s     | %s      | %s%n", date, checkIn, checkOut, hoursWorked));
                }
            }
            writer.write("\n"); 
            System.out.println("Report successfully added to: " + REPORT_FILE);
        } 
        catch (IOException e) 
        {
            System.out.println("Error while writing report: " + e.getMessage());
        }
    }

    public void readReport() 
    {
        System.out.println("-----Attendance report of Employee-----");
        try (BufferedReader reader = new BufferedReader(new FileReader(REPORT_FILE))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Report file not found.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error while reading report: " + e.getMessage());
        }
    }
}
