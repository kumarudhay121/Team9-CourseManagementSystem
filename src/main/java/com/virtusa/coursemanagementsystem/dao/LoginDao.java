package com.virtusa.coursemanagementsystem.dao;

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

    public static String getUserType(String username) throws SQLException {
        try {
            // Establish database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnsphere", "root", "root");

            // Create SQL statement
            String sql = "SELECT usertype FROM user WHERE username = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);

            // Execute SQL statement
            ResultSet resultSet = statement.executeQuery();

            // Check if user exists
            if (resultSet.next()) {
                // Retrieve user type
                String userType = resultSet.getString("usertype");

                // Close database connection
                conn.close();

                return userType;
            } else {
                // Close database connection
                conn.close();

                // User not found
                return null;
            }
        } catch (SQLException e) {
            throw e; // Rethrow the exception to be handled by the caller
        }
    }
}
