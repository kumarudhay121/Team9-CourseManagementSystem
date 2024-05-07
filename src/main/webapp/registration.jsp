<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- MIUI CSS -->
    <link href="https://cdn.jsdelivr.net/npm/miuicss@3.0.0-beta.29/dist/mui.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="card w-50 mx-auto">
            <div class="card-body">
                <h5 class="card-title text-center mb-4">User Registration</h5>
                <form action="register" method="post">
                    <div class="mb-3">
                        <input type="text" class="form-control" name="name" placeholder="Name" required>
                    </div>
                    <div class="mb-3">
                        <input type="text" class="form-control" name="phone" placeholder="Phone" required>
                    </div>
                    <div class="mb-3">
                        <input type="text" class="form-control" name="username" placeholder="Username" required>
                    </div>
                    <div class="mb-3">
                        <input type="text" class="form-control" name="email" placeholder="Email" required>
                    </div>
                    <div class="mb-3">
                        <input type="password" class="form-control" name="password" placeholder="Password" required>
                    </div>
                    <div class="mb-3">
                        <select class="form-select" name="usertype" required>
                            <option value="">Select User Type</option>
                            <option value="admin">Admin</option>
                            <option value="student">Student</option>
                        </select>
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-primary">Register</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
