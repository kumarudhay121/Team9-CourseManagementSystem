<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ page import="java.util.List" %>
<%@ page import="com.online.course.Model.Course" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Course Details</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <style>
    /* Custom CSS */
    body {
        background-color: #222;
        color: #eee;
    }
    .navbar-light .navbar-brand,
    .navbar-light .navbar-nav .nav-link {
        color: #eee;
    }
    .navbar-light .navbar-toggler-icon {
        background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' width='30' height='30' viewBox='0 0 30 30'%3e%3cpath stroke='%23eee' stroke-width='2' stroke-linecap='round' stroke-miterlimit='10' d='M4 7h22M4 15h22M4 23h22'/%3e%3c/svg%3e");
    }
    .navbar-light .navbar-toggler {
        border-color: #eee;
    }
    .nav-link {
        color: #eee !important;
        transition: color 0.3s ease-in-out;
    }
    .nav-link:hover {
        color: #87ceeb !important; /* Sky blue color */
    }
    .card {
        border-radius: 30px;
        background-color: #333;
        color: #eee;
        margin-bottom: 20px;
    }
    .card:hover {
        transform: translateY(-10px);
        background-color-primary;
    }
    .card-title {
        color: #eee;
    }
    .card-text {
        color: #ddd;
    }
    .btn-primary {
        background-color: #007bff;
        border-color: #007bff;
    }
    .btn-primary:hover {
        background-color: #0056b3;
        border-color: #0056b3;
    }
    .navbar-toggler {
        background-color: #007bff;
    }
    .navbar-toggler:hover {
        background-color: #0056b3;
    }
    .form-control {
        background-color: #333;
        color: #eee;
        border-color: #666;
    }
    .form-control::placeholder {
        color: #ccc;
    }
    .btn-outline-primary {
        color: #007bff;
        border-color: #007bff;
    }
    .btn-outline-primary:hover {
        background-color: #007bff;
        color: #fff;
    }
    .navbar-brand {
        font-weight: bold;
        font-size: 1.5rem;
    }
    .navbar-nav {
        margin-left: auto;
    }
    .nav-link {
        color: #eee;
    }

    </style>
</head>
<body>
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <!-- Left Side - Search -->
        <form class="form-inline">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-primary my-2 my-sm-0" type="submit"><i class="fas fa-search"></i></button>
        </form>
        <!-- Center - Course Website Name -->
        <a class="navbar-brand mx-auto" href="#">My Enrolled Courses</a>
        <!-- Right Side - Login/Member Details -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Member Details</a>
            </li>
        </ul>
    </nav>
    <!-- Main Content -->
    <div class="container mt-4">
        <div class="row">
            <!-- Left Side - Navigation Links -->
            <!-- after pages done by priy link for the pages -->
            <div class="col-lg-3">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link" href="#"><i class="fas fa-home"></i> Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><i class="fas fa-envelope"></i> Messages</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><i class="fas fa-tasks"></i> Tasks</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><i class="fas fa-cog"></i> Settings</a>
                    </li>
                </ul>
            </div>
            <!-- Main Middle - Course Cards -->
            <div class="col-lg-9">
                <div class="row">
                    <!-- Course Card - Java -->
                    <div class="container">

                           <div class="row">
                               <%-- Loop through enrolled courses and display them as cards --%>
                               <%
                                   List<Course> enrolledCourses = (List<Course>) request.getAttribute("enrolledCourses");
                                   for (Course course : enrolledCourses) {
                               %>
                               <div class="col-md-4">
                                   <div class="card mt-4">
                                       <div class="card-body">
                                           <h5 class="card-title"><%= course.getCourseName() %></h5>
                                           <h6 class="card-subtitle mb-2">Course ID: <%= course.getCourseId() %></h6>
                                           <p class="card-text"><%= course.getCourseDescription() %></p>
                                           <p class="card-text">Instructor: <%= course.getInstructor() %></p>
                                       </div>
                                   </div>
                               </div>
                               <% } %>
                           </div>
                       </div>



                </div>
            </div>
        </div>
    </div>
    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
