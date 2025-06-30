import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class CursorExample 
{
    public static void main(String[] args) 
    {
         String url = "jdbc:oracle:thin:@//localhost:1521/orclpdb"; 
        String username = "hr";                 
        String password = "hr";
        try
        {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection conn = DriverManager.getConnection(url, username, password);
             CallableStatement cst=conn.prepareCall("{call getStudentName(?,?)}");
             cst.setString(1,"F");
             cst.registerOutParameter(2,Types.REF_CURSOR);
             cst.execute();
            ResultSet res=(ResultSet)cst.getObject(2);
            while(res.next())
            {
             System.out.println("Student Name: "+res.getString("sname"));
            }
             cst.close();
             conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
