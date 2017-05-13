<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%> 
<%@page import="java.util.List"%>   
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewDepartment</title>
</head>
<body>

				<h2> Welcome ${user.firstName }</h2><br/>
				
				<h2> List of Departments</h2><br/>
<a href = 'newdepartment.html'>Add Department</a>  <br/>  <a href = 'newprogram.html'>Add Program</a> <br/> <a href = 'newfields.html'>Add Additional Fields</a>
				<table border='1'>
				<tr>
				<td>Department ID</td>
				<td>Department Name</td>
				<td>Programs Offered</td>
				<td>Operations</td>
				</tr>
				
<c:forEach items="${department }" var="a">
	<tr>
			<td>
		<c:out value ="${a.dpmtId }"></c:out>
			</td>
			<td>
		<c:out value ="${a.dpmtName }"></c:out>
			</td>
			
		<c:set var="count" value="0"></c:set>
		<c:forEach items="${Programs }" var="program">
			<c:if test="${program.department.dpmtId eq a.dpmtId }">
				<c:set var="count" value="${count+1}"></c:set>
			</c:if> 
			
		</c:forEach> 
			<td>${count}</td>
			<td>
			<a href='view.html?dpmtId=${a.dpmtId }'>View</a> <a href='edit.html?dpmtId=${a.dpmtId }'>edit</a>
			</td>
			</tr>
	
	</c:forEach>				
</table>
<a href = 'logout.html'>Logout</a>
</body>
</html>