<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create new Employee</title>
</head>
<body>
	<div align="center">
		<h1>Create new Employee</h1>
		<br/><br/>
			<form:form action="save" method="post" modelAttribute="employee">
				<table border="1">
					<tr>	
						<td>First Name</td>
						<td><form:input path="firstName"/></td>
					</tr>
					<tr>	
						<td>Last Name</td>
						<td><form:input path="lastName"/></td>
					</tr>
					<tr>	
						<td>Email</td>
						<td><form:input path="email"/></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Save"/></td>
					</tr>
				</table>
			</form:form>
	</div>

</body>
</html>