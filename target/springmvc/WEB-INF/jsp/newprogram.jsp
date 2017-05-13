<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Program</title>
</head>
<body>
<form action = "newprogram.html" method = "post">
Select Department : <select name = "department">
	<c:forEach items="${deparmtents }" var="department">
	<option value = "${department.dpmtId}">${department.dpmtName}</option>
	</c:forEach>
</select>
Program Name : <input type="text" name ="name" >
<input type="submit" name = "ADD" value ="ADD">


</form>

</body>
</html>