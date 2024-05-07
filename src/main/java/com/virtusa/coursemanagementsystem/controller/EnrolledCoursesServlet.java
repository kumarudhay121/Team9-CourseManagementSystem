package com.virtusa.coursemanagementsystem.controller;


import com.virtusa.coursemanagementsystem.dto.CourseListDTO;
import com.virtusa.coursemanagementsystem.util.EnrolledCoursesService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/enrolledCourses")
public class EnrolledCoursesServlet extends HttpServlet {
    private EnrolledCoursesService enrolledCoursesService;

    public EnrolledCoursesServlet() {
        this.enrolledCoursesService = new EnrolledCoursesService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ddfguhjgcfxghvjhvc");
        // Assuming the student ID is stored in the session
        String studentId = "1";

        // Call a method from service layer to retrieve enrolled courses based on student ID
        List<CourseListDTO> enrolledCourses = enrolledCoursesService.retrieveEnrolledCourses(studentId);

        // Set enrolled courses as a request attribute
        request.setAttribute("enrolledCourses", enrolledCourses);

        // Forward the request to enrolledCourses.jsp
       request.getRequestDispatcher( "/enrolledCourses.jsp").forward(request, response);
//        request.sendRedirect(request.getContextPath() + "/enrolledCourses.jsp");
    }
}
