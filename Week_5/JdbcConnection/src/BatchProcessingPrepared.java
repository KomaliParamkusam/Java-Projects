import java.sql.*;

public class BatchProcessingPrepared 
{
    public static void main(String[] args) 
    {
        String url="jdbc:oracle:thin:@//localhost:1521/orclpdb";
        String uname="hr";
        String password="hr";

        try (Connection conn = DriverManager.getConnection(url, uname, password)) 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn.setAutoCommit(false);  

            // ========== 1. INSERT Batch ==========
            // String[] name={"Uma","Komali","Monika","Naseema"};
            // String[] grade={"A+","F","C","O"};
            // int[] mrks={98,26,54,99};
            // String insertSQL = "INSERT INTO Student(sid, sname, grade,marks) VALUES (?, ?, ?, ?)";
            // try (PreparedStatement insertStmt = conn.prepareStatement(insertSQL)) 
            // {
            //     for (int i = 0; i <name.length; i++) 
            //     {
            //         insertStmt.setInt(1, 300 + i);
            //         insertStmt.setString(2, name[i]);
            //         insertStmt.setString(3, grade[i]);
            //         insertStmt.setInt(4,mrks[i]);

            //         insertStmt.addBatch();
            //     }
            //     insertStmt.executeBatch();
            //     System.out.println("Insert batch completed.");
            // }

            // ========== 2. UPDATE Batch ==========
            String updateSQL = "UPDATE Student SET sid = sid - 100 WHERE sid = ?";
            try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) 
            {
                for (int i = 0; i < 4; i++) 
                {
                    updateStmt.setInt(1, 300 + i);  // Update first 3 employees
                    updateStmt.addBatch();
                }
                updateStmt.executeBatch();
                System.out.println("Update batch completed.");
            }
            conn.commit();
            String selectq="SELECT *FROM Student";
            PreparedStatement psmnt2=conn.prepareStatement(selectq); 
            ResultSet res=psmnt2.executeQuery();
            while(res.next())
            {
                System.out.println(res.getString("sid")+" - "+res.getString("sname")+" - "+res.getString("grade")+" - "+res.getString("marks"));

            } 
            conn.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
