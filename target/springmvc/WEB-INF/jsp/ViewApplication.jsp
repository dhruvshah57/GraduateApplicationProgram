<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%> 
<%@page import="java.util.List"%>   
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewApplication</title>
</head>
<body>
<a href = '../studentHome.html'>Return to Home</a>
<h2> Application Information</h2>

<table border="1">
								
		<%-- <c:forEach items="${studentInfo.edubckgrnd }" var="studentInfo">--%>
			
	<tr><td> Department: <c:out value ="${studentInfo.applications.program.department.dpmtName }"></c:out></td></tr>
	<tr><td> Program: <c:out value= "${studentInfo.applications.program.programName}"></c:out></td></tr>
	<tr><td> Term Applied for: <c:out value ="${studentInfo.applications.term }"></c:out></td></tr>
		</table>
		<h2> Student Information</h2>
		<table border ="1">
			<tr><td> Applicant First Name: <c:out value ="${studentInfo.fName }"></c:out></td></tr>
			<tr><td> Last Name: <c:out value ="${studentInfo.lName }"></c:out></td></tr>
			<tr><td> CIN: <c:out value ="${studentInfo.cin }"></c:out></td></tr>
			<tr><td> Date Of Birth: <c:out value ="${studentInfo.dob }"></c:out></td></tr>
			<tr><td> Gender: <c:out value ="${studentInfo.gender }"></c:out></td></tr>
			<tr><td> Phone No: <c:out value ="${studentInfo.phoneNo }"></c:out></td></tr>
			<tr><td> Citizenship: <c:out value ="${studentInfo.citizenship }"></c:out></td></tr>
			<tr><td> Phone No: <c:out value ="${studentInfo.phoneNo }"></c:out></td></tr>
		</table>
		<h2> Educational Background</h2>
		<table border="1">
			<c:forEach items="${studentInfo.edubckgrnd }" var="a">
			
				<tr><td> Degree Received: <c:out value="${a.degreeRecieved }"></c:out></td></tr>
				<tr><td> College: <c:out value="${a.college }"></c:out></td></tr>
				<tr><td> University: <c:out value="${a.university }"></c:out></td></tr>
		 		<tr><td> Start Date: <c:out value="${a.startDate }"></c:out></td></tr> 
				<tr><td> End Date: <c:out value="${a.endDate }"></c:out></td></tr>
			</c:forEach>
		</table>
		<h2> Academic Records</h2>
		<table border="1">
			<tr><td> TOEFL: <c:out value ="${studentInfo.acadrecord.toefl }"></c:out></td></tr>
			<tr><td> GPA: <c:out value ="${studentInfo.acadrecord.gpa }"></c:out></td></tr>
			<tr><td> GRE: <c:out value ="${studentInfo.acadrecord.gre }"></c:out></td></tr>
			<tr><td><a href = "../DownloadFile/${studentInfo.acadrecord.transcript}.html" target = "_blanck"><b>${studentInfo.acadrecord.transcript }</b></a></td></tr>
		</table>	
<a href = '../home.html'>Logout</a>
</body>
</html>