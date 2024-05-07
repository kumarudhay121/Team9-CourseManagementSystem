package com.virtusa.coursemanagementsystem.dao;



import com.virtusa.coursemanagementsystem.dto.CourseListDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnrolledCoursesDAO {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/onlinecourse";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";

    // SQL query to retrieve enrolled courses for a student
    private static final String SQL_SELECT_ENROLLED_COURSES = "SELECT ec.courseId, courseName, courseDescription, instructor " +
            "FROM enrolled_courses ec " +
            "JOIN courses ON ec.courseId = courses.courseId " +
            "WHERE studentId = ?";

    // Method to retrieve enrolled courses using JDBC
    public List<CourseListDTO> retrieveEnrolledCourses(String studentId) {
        List<CourseListDTO> enrolledCourses = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ENROLLED_COURSES)) {
            // Set studentId parameter
            preparedStatement.setString(1, studentId);

            // Execute query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Process ResultSet
            while (resultSet.next()) {
                CourseListDTO course = new CourseListDTO();
                course.setCourseId(resultSet.getInt("courseId"));
                course.setCourseName(resultSet.getString("courseName"));
                course.setCourseDescription(resultSet.getString("courseDescription"));
                course.setInstructor(resultSet.getString("instructor"));
                enrolledCourses.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions here
        }
        return enrolledCourses;
    }
}
