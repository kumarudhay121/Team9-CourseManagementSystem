<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- MIUI CSS -->
    <link href="https://cdn.jsdelivr.net/npm/miuicss@3.0.0-beta.29/dist/mui.dark.min.css" rel="stylesheet">
    <!-- MIUI Icons -->
    <link href="https://cdn.jsdelivr.net/npm/miuicss@3.0.0-beta.29/dist/mui-icons.css" rel="stylesheet">
    <!-- Custom CSS -->
    <style>
        body {
            background-image: url('https://1.bp.blogspot.com/-twNnXhkBlas/U2BZcgO76zI/AAAAAAABotc/8wadEAYo0pM/s400/6.gif');
            background-size: cover;
        }

        .card {
            background-color: rgba(255, 255, 255, 0.5); /* Adjust the last value (0.5) to change the transparency level */
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="card w-50 mx-auto">
            <div class="card-body">
                <h2 class="card-title text-center mb-4">Login</h5>
                <form action="login" method="post">
                    <div class="mb-3">
                        <input type="text" class="form-control" name="username" placeholder="Username" required>
                    </div>
                    <div class="mb-3">
                        <input type="password" class="form-control" name="password" placeholder="Password" required>
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-primary">Login <i class="mii-arrow-right"></i></button>
                    </div>
                </form>
                <p class="text-center mt-3">Don't have an account? <a href="registration.jsp">Register <i class="mii-arrow-right-circle-fill"></i></a></p>
            </div>
        </div>
    </div>
</body>
</html>
