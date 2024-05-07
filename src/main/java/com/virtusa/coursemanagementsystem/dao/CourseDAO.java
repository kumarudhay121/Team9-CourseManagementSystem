package com.virtusa.coursemanagementsystem.dao;

import com.virtusa.coursemanagementsystem.dto.CourseDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
    private static final String FETCH_ALL_COURSES_SQL = "SELECT id, name, description, price, rating FROM courses";
    private Connection connection;

    public CourseDAO(Connection connection) {
        this.connection = connection;
    }

    public List<CourseDTO> fetchAllCourses() throws SQLException {
        List<CourseDTO> courses = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = connection.prepareStatement(FETCH_ALL_COURSES_SQL);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                CourseDTO course = new CourseDTO(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getDouble("price"),
                        rs.getDouble("rating")
                );
                courses.add(course);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
        }

        return courses;
    }

    public CourseDTO findCourseAll(String name) throws SQLException {
        CourseDTO course = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = connection.prepareStatement(FETCH_ALL_COURSES_SQL);
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
