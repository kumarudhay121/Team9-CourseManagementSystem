package com.virtusa.coursemanagementsystem.controller;

import com.virtusa.coursemanagementsystem.dao.CourseDAO;
import com.virtusa.coursemanagementsystem.dto.CourseDTO;
import com.virtusa.coursemanagementsystem.util.ConnectionUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet("/courseDetails")
public class CourseDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private CourseDAO courseDAO;

    @Override
    public void init() throws ServletException {
        Connection connection = null;
        ConnectionUtil connectionUtil = new ConnectionUtil();
        try {
            connection = connectionUtil.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        courseDAO = new CourseDAO(connection);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String courseName = null;
        courseName = request.getParameter("courseName");


        if (courseName == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing course ID parameter");
            return;
        }

        CourseDTO course = null;
        try {
            course = courseDAO.findCourseByName(courseName);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Error retrieving course details", e);
        }

        if (course != null) {
            request.setAttribute("course", course);
            RequestDispatcher dispatcher = request.getRequestDispatcher("coursedetails.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Course not found");
        }
    }
}
