package com.virtusa.coursemanagementsystem.controller;

import com.backend.bao.RegistrationBao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String userType = request.getParameter("usertype");

        try {
            // Call BAO to register user
            RegistrationBao.registerUser(name, phone, username, email, password, userType);

            // Redirect to login page
            response.sendRedirect("login.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Handle registration error
        }
    }
}
