<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%> 
<%@page import="java.util.List"%>   
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Home</title>
</head>
<body>
				<h2> Welcome ${user.firstName }</h2><br/>
								
				<h2> List of Application</h2><br/>
				
<c:if test="${message != null }">
	<c:out value = "${message }, Click on Below link to add new application"></c:out>
</c:if>				
<a href = 'NewApplication.html'>Create New Application</a> <br/> 
<c:if test="${student.size() > 0 }">		
				<table border='1'>
				<tr>
				<td>Department</td>
				<td>Program Name</td>
				<td>Application Submitted on</td>
				<td>Term</td>
				<td>Status</td>
				<td>Operations</td>
				</tr>
		
<c:forEach items="${student }" var="student">
	<tr>
		<td>
			<c:out value ="${student.applications.program.department.dpmtName }"></c:out>
			<%-- <c:forEach items ="${Department }" var="p">
			<c:out value ="${p.dpmtName }"></c:out>
			</c:forEach> --%>
		</td>
		<td>
			<c:out value ="${student.applications.program.programName }"></c:out>
		</td>
		<td>
			<c:out value ="${student.applications.submittedOn }"></c:out>
			</td>
		<td>
			<c:out value ="${student.applications.term }"></c:out>
			</td>
		<td>
			<c:out value="${student.applications.status.statusName }"></c:out>
		</td>
		
		<td>
			<a href='ViewApplication/${student.stuinfoId }.html'>View</a>
			 
			  
			 <c:if test="${student.applications.status.statusName eq 'Saved'  }">
				<a href='EditApplication/${student.stuinfoId }.html'>edit</a>
			 <a href='Submit/${student.stuinfoId }.html'>Submit</a> 
			  </c:if>
		</td>
	</tr>
	
	</c:forEach>				
</table>
</c:if>
<a href = 'logout.html'>Logout</a>
</body>
</html>