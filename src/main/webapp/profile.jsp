<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body> 
<h3>  Username :     ${sessionScope.session_username} </h3>
<h3> Password :      ${sessionScope.session_Password} </h3>
<h3> Mobile Number : ${sessionScope.session_mobno}    </h3>
<h3> Email :         ${sessionScope.session_emailid}  </h3>
</body>
</html>