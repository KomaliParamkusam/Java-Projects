import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExample 
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
            Statement smnt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = smnt.executeQuery(
    "SELECT sid, sname, grade, marks FROM student FOR UPDATE"
);
            rs.afterLast();
            System.out.println("------Initial Student table------");
            while(rs.previous())
            {
                System.out.println(rs.getInt("sid") + " - " +
                rs.getString("sname") + " - " +
                rs.getString("grade") + " - " +
                rs.getInt("marks"));
            }
            // rs.absolute(3);
            // int currentmarks=rs.getInt("marks");
            // rs.updateInt("marks",currentmarks+60);
            // rs.updateRow();
            // System.out.println("-----3 rd row updated successfully-----");
            // rs.last();
            // rs.deleteRow();
            // System.out.println("------Last row deleted successfully------");
            // rs.moveToInsertRow();
            // rs.updateInt("sid",409);
            // rs.updateString("sname","Arun");
            // rs.updateString("grade","B");
            // rs.updateInt("marks",56);
            // rs.insertRow();
            // rs.moveToCurrentRow();
            // System.out.println("------Row Inserted successfully------");
            // System.out.println("------Updated Student Records-----");
            // rs.beforeFirst();
            // while (rs.next()) {
            //     System.out.println(rs.getInt("sid") + " - " +
            //                        rs.getString("sname") + " - " +
            //                        rs.getDouble("grade") + " - " +
            //                        rs.getString("marks"));
            // }

        rs.close();
        smnt.close();
        con.close();

           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}