package com.virtusa.coursemanagementsystem.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        // Get the session associated with this request
        HttpSession session = request.getSession(false); // Don't create a new session if it doesn't exist

        // If a session exists, invalidate it
        if (session != null) {
            session.invalidate(); // Invalidate the session
        }

        // Redirect the user to the homepage
        response.sendRedirect("index.jsp");
    }
}
