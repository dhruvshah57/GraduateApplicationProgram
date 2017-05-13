<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%> 
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang=en>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Application</title>
<script type="text/javascript" src="javascript/jquery-2.1.1.min.js"></script>
	<script type="text/javascript">
	$(function(){
	   $('#listOfDepartments').change(function(){
	   	var dpmtID = $( "#listOfDepartments").val();
	   	$.ajax({
	           url: 'GetProgram.html',
	           data: ({
	        	   dpmtID : dpmtID,
	               }),
	               success: function(data){ $('#listOfPrograms').html(data); }
	       });
	   });
	});
	</script>
</head>
<body>
<h2>Make New Application</h2>
<form action = "<c:if test="${studentInfo != null}">../</c:if>NewApplication.html" method = "post">
<table>
<p>Select Department</p>
<c:choose>
<c:when test="${studentInfo != null }">
	<c:out value="${studentInfo.applications.program.department.dpmtName }"></c:out> 
	<input type = "hidden" name = "studentID" value = "${studentInfo.stuinfoId}"/>
	<input type="hidden" name = "department" value = "${studentInfo.applications.program.department.dpmtId}"/>
</c:when>
<c:otherwise>
<select id = "listOfDepartments" name = "department" class="form-control" required>
		<option></option>
			<c:forEach items="${departments }" var="department" >
				<option value="${department.dpmtId }">${department.dpmtName}</option>
			</c:forEach>
	</select>
</c:otherwise>

</c:choose>
	
			 	
<p>Select Program</p>
<c:choose>
	<c:when test = "${studentInfo != null }">
		<select id = "listOfPrograms" name = "program" class="form-control" required>
			<c:forEach items="${programs }" var="program">
			
			<option value = "${program.programId}" <c:if test = "${studentInfo.applications.program.programId == program.programId}">selected</c:if>>${program.programName}</option>
		</c:forEach>
		</select>
	</c:when>
	<c:otherwise>
		<select id = "listOfPrograms" name = "program" class="form-control" required></select></br>	
	</c:otherwise>
</c:choose>
	
	<tr><td>Term: </td>
	
	<td><input type='text' name='term' required <c:if test="${studentInfo != null }"> value='${studentInfo.applications.term}'</c:if>></td></tr>	
<h2>STUDENT INFORMATION</h2>

					<tr><td> Last Name:</td>
					<td><input type='text' name='lastname' <c:if test="${studentInfo != null }"> value='${studentInfo.lName}'</c:if> required/></td></tr>
					<tr><td> First Name:</td>
					<td><input type='text' name='firstname' <c:if test="${studentInfo != null }"> value='${studentInfo.fName }'</c:if> required/></td></tr>
					<tr><td> CIN:</td>
					<td><input type='text' name='cin' <c:if test="${studentInfo != null }"> value='${studentInfo.cin }'</c:if> required/></td></tr>
					<tr><td> Date of Birth(dd-MM-yyyy):</td>
					<td><input type="date" name='dob' placeholder="dd-MM-yyyy" <c:if test="${studentInfo != null }"> value='<fmt:formatDate pattern="yyyy-MM-dd" value='${studentInfo.dob }' />'</c:if> required/></td></tr>
					<tr><td> Gender:</td>
					<td><input type='text' name='gender' <c:if test="${studentInfo != null }"> value='${studentInfo.gender }'</c:if> required/></td></tr>
					<tr><td> Phone No:</td>
					<td><input type='text' name='phoneno'<c:if test="${studentInfo != null }"> value='${studentInfo.phoneNo }'</c:if> required/></td></tr>
					<tr><td> Citizenship:</td>
					<td><input type='text' name='citizenship' <c:if test="${studentInfo != null }"> value='${studentInfo.citizenship }'</c:if>required/></td></tr>
					<tr><td><input type='submit' value='Save and Continue'/></td></tr>
</table>
</form>
</body>
</html>