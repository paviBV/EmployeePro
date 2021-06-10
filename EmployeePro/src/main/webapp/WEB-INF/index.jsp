<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management</title>
</head>
<body>
	<div align="center">
	<h1>Employee Details</h1>	
	<a href="new">Create new Employee</a>
	<br/><br/>
		<table border="2" width="70%" cellpadding="4">
			<thead>
				<tr>
					<th>Employee Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Actions</th>					
				</tr>
			</thead>
			<c:forEach var="employee" items="${listEmployees}">
			<tbody>			
				<tr>
					<td>${employee.empId}</td>
					<td>${employee.firstName}</td>
					<td>${employee.lastName}</td>
					<td>${employee.email}</td>
					<td><a href="update/${employee.empId}">Update</a>&#160;
					<a href="delete/${employee.empId}">delete</a></td>					
				</tr>
			</tbody>
			</c:forEach>
		</table>	
	</div>
</body>
</html>