<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<table border="1" width="90%" >
		<tr>
			<th>Roll_Number</th>
			<th>Name</th>
			<th>College_Name</th>
			<th>Course</th>
			<th>Branch</th>
			<th>University</th>
			<th>College_Address</th>
			<th>Passout_year</th>
			<th>Division</th>

		</tr>
		<c:forEach items="${details}" var="d">

			<tr>
				<td>${d.roll}</td>
				<td>${d.name}</td>
				<td>${d.college}</td>
				<td>${d.course}</td>
				<td>${d.branch}</td>
				<td>${d.university}</td>
				<td>${d.college_address}</td>
				<td>${d.passout_year}</td>
				<td>${d.division}</td>
				</tr>
		</c:forEach>
	</table>
</body>
</html>