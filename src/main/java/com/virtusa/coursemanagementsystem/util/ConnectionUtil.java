package com.virtusa.coursemanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionUtil {
    static ResourceBundle rb = ResourceBundle.getBundle("application.properties");
    private static final String DRIVER_CLASS = rb.getString("driver.name");
    private static final String URL = rb.getString("driver.url");
    private static final String USERNAME = rb.getString("driver.username");
    private static final String PASSWORD = rb.getString("driver.password");

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
