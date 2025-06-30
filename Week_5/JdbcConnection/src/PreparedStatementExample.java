import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementExample 
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
            //  String insertq="INSERT INTO Student VALUES(?,?,?,?)";
            // PreparedStatement pstmnt=con.prepareStatement(insertq);
            //  pstmnt.setInt(1, 107);
            // pstmnt.setString(2, "Karthik");
            // pstmnt.setString(3, "A");
            // pstmnt.setInt(4, 92);
            // int row=pstmnt.executeUpdate();
            // System.out.println(row+" row is inserted successfully");
           
            String selectq="SELECT *FROM Student";
            PreparedStatement psmnt2=con.prepareStatement(selectq);
            ResultSet res=psmnt2.executeQuery();
            while(res.next())
            {
                System.out.println(res.getString("sid")+" - "+res.getString("sname")+" - "+res.getString("grade")+" - "+res.getString("marks"));

            } 
            res.close();
            psmnt2.close();
           // pstmnt.close();
            con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
