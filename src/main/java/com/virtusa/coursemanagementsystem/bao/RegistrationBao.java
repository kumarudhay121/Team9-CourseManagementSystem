package com.backend.bao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationBao {
    public static void registerUser(String name, String phone, String username, String email, String password, String userType) throws SQLException {
        try {
            // Establish database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnsphere", "root", "root");

            // Create SQL statement
            String sql = "INSERT INTO user (name, phone, username, email, user_password, usertype) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, phone);
            statement.setString(3, username);
            statement.setString(4, email);
            statement.setString(5, password);
            statement.setString(6, userType);

            // Execute SQL statement
            statement.executeUpdate();

            // Close database connection
            conn.close();
        } catch (SQLException e) {
            throw e; // Rethrow the exception to be handled by the caller
        }
    }
}
