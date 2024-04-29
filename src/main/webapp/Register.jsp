<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
        }

        .container {
            margin: 0 auto;
            padding: 60px;
            width: 500px;
            background-color: #fff;
            border-radius: 40px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        }

        input[type="text"],
        input[type="password"],
        input[type="email"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 2px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"],
        input[type="button"] {
            background-color: #007BFF;
            color: #fff;
            padding:15px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover,
        input[type="button"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Login Page</h2>
        <form method="post" action="Registrationform">
            <label for="Username"></label>
            <input type="text" name="Username" id="Username" placeholder = "Username" required><br><br>

            <label for="Password"></label>
            <input type="password" name="Password" id="Password"   placeholder = "Password" required><br><br>

            <label for="mobno"></label>
            <input type="text" name="mobno" id="mobno"  placeholder = "Mobile number" required><br><br>

            <label for="emailid"></label>
            <input type="email" name="emailid" id="emailid"  placeholder = "Emailid" required><br><br>

            <input type="submit" value="Register" href= "index.jsp"><br><br>
           
        </form>

        <input type="button" value="Go to Login Page" onclick="goToLoginPage()">
    </div>

    <script>
        function goToLoginPage() {
            window.location.href = "login.jsp";
        }
    </script> 

   
</body>
</html>
