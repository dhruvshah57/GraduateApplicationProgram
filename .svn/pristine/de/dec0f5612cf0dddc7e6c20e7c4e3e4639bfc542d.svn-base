<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%> 
<%@page import="java.util.List"%>   
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Department</title>
</head>
<body>
<a href = 'Add Department'></a><br/>
				<h2> View Department Details </h2><br/>
				<table border='1'>
				<tr>
				<td>Department Name </td>
				<td>Program Name</td>
				<td>Additional Requirements</td>
				</tr>
        <tr>		
		     <td>
		          <c:out value ="${department.dpmtName }"></c:out>
			</td>
			<td>		
             <c:forEach items="${programs }" var="a">
			
			 <c:out value ="${a.programName }"></c:out>
			 </c:forEach>
			</td>
			<td>		
             <c:forEach items="${AdditionalRequirements }" var="f">
			
			 <c:out value ="${f.addInfoName }"></c:out>,
			 <c:out value ="${f.type }"></c:out>,
			 <c:out value ="${f.required }"></c:out>
			 </c:forEach>
			</td>
			  
			</tr>				
</table>
</body>
</html>