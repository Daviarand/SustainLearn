package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Utility.JDBCConnection;

public class LoginModels {


    public static boolean login(String username, String password) {
        String query = "SELECT * FROM register WHERE Username = ? AND Password = ?";
        try (Connection conn = JDBCConnection.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.err.println("Error in login method");
            e.printStackTrace();
            return false;
        }
    }

    
}