<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>

<form method='post' modelAttribute = "users">
					<table>
					<tr><td> Email ID:</td>
					<td><input type='text' name='emailID' required/></td></tr>
					<tr><td> Password : </td>
					<td><input type='text' name='password' required/></td></tr>
					<tr><td> First Name:</td>
					<td><input type='text' name='firstName' required/></td></tr>
					<tr><td> Last Name :</td>
					<td><input type='text' name='lastName' required/></td></tr>
					
					
					<tr><td><input type='submit' value='register'/></td></tr>
					</table>
					</form>

</body>
</html>