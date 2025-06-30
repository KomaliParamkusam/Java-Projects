
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcStatementExample 
{
    public static void main(String[] args) 
    {
        String url="jdbc:oracle:thin:@//localhost:1521/orclpdb";
        String uname="hr";
        String password="hr";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url, uname, password);
            Statement stmnt=con.createStatement();
            // String query="CREATE TABLE Student(sid int Primary Key,sname varchar(30),grade varchar(10),marks int)";
            // stmnt.executeUpdate(query);
            // System.out.println("Table created Succefully");
            // String query2="""
            //                   INSERT ALL INTO Student(sid,sname,grade,marks) values(101,'Alia','A+',96)
            //                     INTO Student(sid,sname,grade,marks) values(102,'Varun','B',85)
            //                     INTO Student(sid,sname,grade,marks) values(103,'Karthik','F',32)
            //                     INTO Student(sid,sname,grade,marks) values(104,'Aditya','O',100)
            //                     INTO Student(sid,sname,grade,marks) values(105,'Suriya','B+',88)
            //                     INTO Student(sid,sname,grade,marks) values(106,'Vijay','C',75)
            //                     select *from dual """;
            // int row=stmnt.executeUpdate(query2);
            // System.out.println(row+" inserted successfully");
            int m=35;
            String query4="DELETE FROM Student where marks<="+m;
            int b=stmnt.executeUpdate(query4);
            System.out.println(b+" row deleted successfully");
            //int m=75;
            String query3="SELECT *FROM Student";
            ResultSet res=stmnt.executeQuery(query3);
            while(res.next())
            {
                
                System.out.println(res.getString("sid")+" - "+res.getString("sname")+" - "+res.getString("grade")+" - "+res.getString("marks"));
            }
            res.close();
            stmnt.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }
}
