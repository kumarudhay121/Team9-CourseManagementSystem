package com.backend.controller;

import com.backend.dao.LoginDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            // Check if user exists
            boolean isValidUser = LoginDao.validateUser(username, password);

            if (isValidUser) {
                // Redirect to respective dashboard based on user type
                // Here you can implement logic to fetch user details from database if needed
                response.sendRedirect("adminDashboard.jsp"); // Assuming admin dashboard
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
