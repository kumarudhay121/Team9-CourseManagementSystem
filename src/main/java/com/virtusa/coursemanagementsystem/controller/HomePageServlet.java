package com.backend.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class HomePageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward the request to the homepage JSP
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}

