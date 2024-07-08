package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Utility.JDBCConnection;

public class RegisterModels {

    public static boolean insertData(int ID, String Username, String Email, String Password) {
        String query = "INSERT INTO register (ID, Username, Email, Password) VALUES (?, ?, ?, ?)";
        try (Connection conn = JDBCConnection.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, ID);
            pstmt.setString(2, Username);
            pstmt.setString(3, Email);
            pstmt.setString(4, Password);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
    
    
    