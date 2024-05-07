package com.virtusa.coursemanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionUtil {
   // static ResourceBundle rb = ResourceBundle.getBundle("application.properties");
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/course_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                Class.forName(DRIVER_CLASS);
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException e) {
                throw new SQLException("Failed to load JDBC driver class", e);
            }
        }
        return connection;
    }
}
