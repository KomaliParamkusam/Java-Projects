import java.sql.*;

public class JdbcCRUDExample 
{
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@//localhost:1521/orclpdb";
        String username = "hr";
        String password = "hr";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database.");

            // // INSERT
            // String insertSQL = "INSERT INTO  empdetails(empid, empname, salary) VALUES (?, ?, ?)";
            // PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
            // insertStmt.setInt(1, 1050);
            // insertStmt.setString(2, "Bharath");
            // insertStmt.setInt(3, 92000);
            // insertStmt.executeUpdate();
            // System.out.println("Inserted Employee.");

            // // SELECT
            // String selectSQL = "SELECT * FROM empdetails";
            // Statement selectStmt = conn.createStatement();
            // ResultSet rs = selectStmt.executeQuery(selectSQL);
            // System.out.println("\nEmployee Records:");
            // while (rs.next()) 
            // {
            //     System.out.println(rs.getInt("empid") + " - " + rs.getString("empname") + " - " + rs.getString("salary"));
            // }

            // // UPDATE
            //  String updateSQL = "UPDATE empdetails SET email = ? WHERE empid = ?";
            // PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
            // updateStmt.setString(1, "bharath@gmail.com");
            // updateStmt.setInt(2, 1049);
            // updateStmt.executeUpdate();
            //  System.out.println("Updated employee salary.");
              
              // SELECT
            //   String selectSQL1 = "SELECT * FROM empdetails";
            // Statement selectStmt1 = conn.createStatement();
            // ResultSet rs1 = selectStmt.executeQuery(selectSQL);
            // System.out.println("\nEmployee Records:");
            //  while (rs1.next()) 
            //  {
            //      System.out.println(rs1.getInt("empid") + " - " + rs1.getString("empname") + " - " + rs1.getString("salary"));
            //  }

            // // DELETE
            // String deleteSQL = "DELETE FROM empdetails WHERE empid = ?";
            // PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL);
            // deleteStmt.setInt(1, 1050);
            // deleteStmt.executeUpdate();
            // System.out.println("Deleted employee.");

              // SELECT
              String selectSQL2 = "SELECT * FROM empdetails FETCH FIRST 2 ROWS ONLY";
            Statement selectStmt2= conn.createStatement();
            ResultSet rs2 = selectStmt2.executeQuery(selectSQL2);
            System.out.println("\nEmployee Records:");
             while (rs2.next()) 
             {
                 System.out.println(rs2.getInt("empid") + " - " + rs2.getString("empname") + " - " + rs2.getString("salary")+" - "+rs2.getString("email"));
             }

            conn.close();
            System.out.println("Connection closed.");

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}

