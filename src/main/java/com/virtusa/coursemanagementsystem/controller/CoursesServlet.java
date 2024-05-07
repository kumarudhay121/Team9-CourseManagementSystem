package com.virtusa.coursemanagementsystem.controller;

import com.virtusa.coursemanagementsystem.dao.CourseDAO;
import com.virtusa.coursemanagementsystem.dto.CourseDTO;
import com.virtusa.coursemanagementsystem.util.ConnectionUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/courses")
public class CoursesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Establish database connection (replace this with your own method to get connection)
    Connection connection = null;
    try {
        connection = ConnectionUtil.getConnection();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    // Create CourseDAO instance with the connection
    CourseDAO courseDAO = new CourseDAO(connection);

    try {
        // Retrieve all courses from the database
        List<CourseDTO> allCourses = courseDAO.fetchAllCourses();

        // Set the list of courses as an attribute in the request object
        request.setAttribute("AllCourses", allCourses);

        // Forward the request to the JSP page for rendering
        request.getRequestDispatcher("/ListOfCourses.jsp").forward(request, response);
    } catch (SQLException e) {
        e.printStackTrace(); // Handle the exception appropriately
    } finally {
        // Close the database connection
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}
