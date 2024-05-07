package com.backend.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public static boolean validateUser(String username, String password) throws SQLException {
        try {
            // Establish database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnsphere", "root", "root");

            // Create SQL statement
            String sql = "SELECT * FROM user WHERE username = ? AND user_password = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            // Execute SQL statement
            ResultSet resultSet = statement.executeQuery();

            // Check if user exists
            boolean userExists = resultSet.next();

            // Close database connection
            conn.close();

            return userExists;
        } catch (SQLException e) {
            throw e; // Rethrow the exception to be handled by the caller
        }
    }
}
