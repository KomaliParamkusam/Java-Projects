import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStatementExample
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
             CallableStatement cst=conn.prepareCall("{call addoperation(?,?,?)}");
             cst.setInt(1,100);
             cst.setInt(2, 200);
             cst.registerOutParameter(3, Types.INTEGER);
             cst.execute();
             System.out.println("Result: "+cst.getInt(3));
             cst.close();
             conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
