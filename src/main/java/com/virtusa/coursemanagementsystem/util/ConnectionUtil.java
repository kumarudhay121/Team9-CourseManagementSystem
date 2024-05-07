package com.virtusa.coursemanagementsystem.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    static Properties pr = PropertyUtil.getProperty();

    private static final String DRIVER_CLASS = pr.getProperty("driver.name");
    private static final String URL = pr.getProperty("driver.url");
    private static final String USERNAME = pr.getProperty("driver.username");
    private static final String PASSWORD = pr.getProperty("driver.password");

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
