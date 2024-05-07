<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" integrity="sha384-鷓YCn32vMUvFWjPwBQLyXsiCZPfqxOEKVZNlEN EWUz9HOaPP+lWQNACStStzUJB6LhJ7+CkXOp+hQz7I/vCD+hzG" crossorigin="anonymous">
</head>
<body>
    <c:if test="${course != null}">
    <header class="container">
        <div class="row align-items-center">
            <div class="col-md-3">
                <img src="logo.png" alt="Logo" class="img-fluid">
            </div>
            <div class="col-md-9">
                <nav class="nav justify-content-end">
                    <a class="nav-link" href="#">Categories</a>
                    <a class="nav-link" href="#">Search</a>
                    <a class="nav-link" href="#">Log in</a>
                    <a class="nav-link" href="#">Sign up</a>
                </nav>
            </div>
        </div>
    </header>
    <main class="container">
        <div class="row">
            <div class="col-md-6">
                <div class="align-items-center mb-3">
                    <h2>${course.name}</h2>
                    <img src="https://tse1.mm.bing.net/th/id/OIP.yoQwUlomxcQOAmYHSOfy8wHaD4?rs=1&pid=ImgDetMain" alt="Course banner" class="img-fluid me-3 rounded-3" >
                    <p>${course.description}</p>
                    <a href="#" class="btn btn-primary" >Enroll course</a>
                </div>
            </div>
            <div class="col-md-6">
                <div class="course-details card">
                    <div class="card-header">
                        <h3>Ratings and Reviews</h3>
                    </div>
                    <div class="card-body">
                        <p>${course.rating}★★★★★ (271,740 ratings)</p>
                        <h3>Created by</h3>
                        <p>Colt Steele</p>
                        <h3>What you'll learn</h3>
                        <ul>
                            <li>The ins and outs of HTML5, CSS3, and Modern JavaScript for 2021</li>
                            <li>Make REAL web applications using cutting-edge technologies</li>
                            <li>Create responsive, accessible, and beautiful websites</li>
                            <li>Recognize and prevent common security vulnerabilities</li>
                        </ul>
                        <a href="/enroll" class="btn btn-primary">Start the survey!</a>
                    </div>
                </div>
            </div>
        </div>
        </c:if>
        <c:if test="${course == null}">
                 <p>Course not found.</p>
        </c:if>
    </main>

    <footer class="container text-center py-3">
        <p>Help us shape virtusa's future! We want to hear from you as we develop products for learners around the world. Share your thoughts with us in a 20-minute survey, and you'll have a chance to win a $100USD (or geographical equivalent) gift card or charity donation.</p>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-鷓YCn32vMUvFWjPwBQLyXsiCZPfqxOEKVZNlEN EWUz9HOaPP+lWQNACStStzUJB6LhJ7+CkXOp+hQz7I/vCD+hzG" crossorigin="anonymous"></script>
</body>
</html>
