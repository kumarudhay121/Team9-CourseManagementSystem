package com.virtusa.coursemanagementsystem.dao;

import com.virtusa.coursemanagementsystem.dto.CourseDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAO {
    private static final String FIND_COURSE_BY_USERNAME_SQL = "SELECT id, name, description, price, rating FROM courses WHERE name = ?";

    private Connection connection;

    public CourseDAO(Connection connection) {
        this.connection = connection;
    }

    public CourseDTO findCourseByName(String name) throws SQLException {
        CourseDTO course = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = connection.prepareStatement(FIND_COURSE_BY_USERNAME_SQL);
            pstmt.setString(1, name);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                course = new CourseDTO(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getDouble("rating")
                );
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
        }

        return course;
    }
}
