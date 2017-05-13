<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Educational Background</title>
<script> function saveForm(){
document.form[0].submit;
}
</script>
<table>
<form action = "EducationalBackground.html" method = "post">
	
<h2>Add Educational Background</h2>
					<tr><td> Degree Received:</td>
					<td><input type='text' name='degree' required/></td></tr>
					<tr><td> College:</td>
					<td><input type='text' name='college' required/></td></tr>
					<tr><td> University:</td>
					<td><input type='text' name='university' required/></td></tr>
					<tr><td> Start Date(dd-MM-yyyy):</td>
					<td><input type='date'  placeholder="dd-MM-yyyy" name='startdate' required/></td></tr>
					<tr><td> End Date(dd-MM-yyyy):</td>
					<td><input type='date'  placeholder="dd-MM-yyyy" name='enddate' required/></td></tr>
					<tr><td> Major:</td>
					<td><input type='text' name='major' required/></td></tr>
					<tr><td><input type='submit' value='Save and Continue'/></td></tr>
					
</form>
</table>

</body>
</html>