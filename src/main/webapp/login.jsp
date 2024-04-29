<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    text-align: center;
    margin: 0;
    padding: 0;
}

.container {
    margin: 0 auto;
    padding: 40px;
    width: 400px;
    background-color: #fff;
    border-radius: 10px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
}

.container h2 {
    color: #007BFF;
}

input[type="text"],
input[type="password"],
input[type="email"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 2px solid #ccc;
    border-radius: 3px;
    font-size: 16px;
}

input[type="submit"] {
    background-color: #007BFF;
    color: #fff;
    padding: 15px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 18px;
}

input[type="submit"]:hover {
    background-color: #0056b3;
}
</style>

</head>
<body>
<div class="container">
    <h2>Login Page</h2>
    <form action="Loginform" method="post"> 
        <label for="email1"></label>
        <input type="text" name="email1" id="email1"  placeholder = "Email" required><br><br>

        <label for="pass1"></label>
        <input type="password" name="pass1" id="pass1" placeholder = "Password" required><br><br>

        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>
