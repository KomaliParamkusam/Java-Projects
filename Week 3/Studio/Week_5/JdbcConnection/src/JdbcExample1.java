import java.sql.*;

public class JdbcExample1
{
    public static void main(String[] args) 
    {
        String url = "jdbc:oracle:thin:@//localhost:1521/orclpdb"; 
        String user = "hr";
        String password = "hr";

        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");

        
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Oracle Database!");

            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM empdetails");

            while (rs.next()) 
            {
                System.out.println(rs.getString("empid")+"   "+rs.getString("empname")+"   "+rs.getString("salary"));
            }

            
            conn.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}

