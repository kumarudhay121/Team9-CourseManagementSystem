<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- MIUI CSS -->
    <link href="https://cdn.jsdelivr.net/npm/miuicss@3.0.0-beta.29/dist/mui.dark.min.css" rel="stylesheet">
    <!-- MIUI Icons -->
    <link href="https://cdn.jsdelivr.net/npm/miuicss@3.0.0-beta.29/dist/mui-icons.css" rel="stylesheet">
    <!-- Custom CSS -->
    <style>
        body {
            background-image: url('https://img.freepik.com/free-photo/pieces-blue-stationery_23-2148169528.jpg?t=st=1715087686~exp=1715091286~hmac=5ee333d8e29e71f0080e1e0102031adeee8bbf555ab920d66e6e626d98807ad1&w=900');
            background-size: cover;
            background-attachment: fixed;
            opacity: 0.8; /* Adjust the opacity as needed */
        }
        .card {
            background-color: rgba(255, 255, 255, 0.5); /* Adjust the last value (0.5) to change the transparency level */
        }
    </style>
</head>
<body>
    <% String msg=(String)request.getAttribute("errorMessage"); %>
    <script>
            // JavaScript block to display alert if msg is not null
            <% if(msg != null) { %>
                alert("<%= msg %>");
            <% } %>
        </script>
    <div class="container mt-5">
        <div class="card w-50 mx-auto">
            <div class="card-body">
                <h3 class="card-title text-center mb-4">Registration</h5>
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
                    <div class="mb-3 form-check">
                        <input type="checkbox" class="form-check-input" id="consent" required>
                        <label class="form-check-label" for="consent">I accept the terms and conditions.<i class="mii-check-square-fill"></i></label>
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
