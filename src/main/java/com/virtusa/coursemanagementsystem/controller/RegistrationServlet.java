package com.virtusa.coursemanagementsystem.controller;

import com.virtusa.coursemanagementsystem.bao.RegistrationBao;
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
        System.out.println("reg jsp to servlet");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String userType = request.getParameter("usertype");

        // Validate form data
        boolean isValid = true;
        StringBuilder errorMessage = new StringBuilder();

        if (!isValidName(name)) {
            System.out.println("name");
            errorMessage.append("Name is required. ");
            isValid = false;
        }

        if (!isValidPhone(phone)) {
            System.out.println("phone");
            errorMessage.append("Phone number must be 10 digits. ");
            isValid = false;
        }

        if (!isValidUsername(username)) {
            System.out.println("username");
            errorMessage.append("Username is required. ");
            isValid = false;
        }

        if (!isValidEmail(email)) {
            System.out.println("email");
            errorMessage.append("Invalid email format. ");
            isValid = false;
        }

        if (!isValidPassword(password)) {
            System.out.println("password");
            errorMessage.append("Password must be at least 8 characters long. ");
            isValid = false;
        }

        if (!isValid) {
            System.out.println("all");
            // If any field is invalid, forward back to registration page with error message
            request.setAttribute("errorMessage", errorMessage.toString());
            request.getRequestDispatcher("registration.jsp").forward(request, response);
            return;
        }

        try {
            // Call BAO to register user
            System.out.println("In reg servlet");
            RegistrationBao.registerUser(name, phone, username, email, password, userType);

            // Redirect to login page
            response.sendRedirect("login.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            // Handle registration error
        }
    }

    private boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }

    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }

    private boolean isValidUsername(String username) {
        return username != null && !username.isEmpty();
    }

    private boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    private boolean isValidPassword(String password) {
        return password != null && password.length() >= 8;
    }

}
