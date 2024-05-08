package com.virtusa.coursemanagementsystem.controller;

import com.virtusa.coursemanagementsystem.dao.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            // Check if user exists and get user type
            boolean isValidUser = LoginDao.validateUser(username, password);
            String userType = LoginDao.getUserType(username); // Assuming this method exists

            if (isValidUser) {
                // Redirect to respective dashboard based on user type
                if ("admin".equals(userType)) {
                    response.sendRedirect("adminDashboard.jsp");
                } else if ("student".equals(userType)) {
                    response.sendRedirect("studentDashboard.jsp");
                } else {
                    // Handle other user types or unknown types
                    response.sendRedirect("login.jsp");
                }
            } else {
                // Invalid credentials, redirect back to login page
                response.sendRedirect("login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle login error
        }
    }
}
