package tracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails 
{
    private int emp_id;
    private String emp_name;
    private List<Attendance> attendanceList;
    public EmployeeDetails(int emp_id, String emp_name) 
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.attendanceList=new ArrayList<>();
    }
    public int getEmp_id() 
    {
        return emp_id;
    }
    public void setEmp_id(int emp_id) 
    {
        this.emp_id = emp_id;
    }
    public String getEmp_name() 
    {
        return emp_name;
    }
    public void setEmp_name(String emp_name) 
    {
        this.emp_name = emp_name;
    }
    public List<Attendance> getAttendanceList() 
    {
        return attendanceList;
    }
    public void setAttendanceList(List<Attendance> attendanceList) 
    {
        this.attendanceList = attendanceList;
    }
    public void addAttendance(Attendance attendance) 
    {
        attendanceList.add(attendance);
    }
    public Attendance getAttendanceByDate(LocalDate date) 
    {
        for (Attendance att : attendanceList) 
        {
            if (att.getDate().equals(date)) 
            {
                return att;
            }
        }
        return null;
    }

    
    
    

}
