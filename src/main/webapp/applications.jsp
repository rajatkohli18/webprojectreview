<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All applicaion users</title>
<h1> CODING CHALLENGE USERS INFORMATION </h1>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	
	<table>
	<tbody>
		<tr><th>Email</th><th>First Name</th><th>Last Name</th><th>Phone</th><th>Location</th><th>Date Of Birth</th><th>Experience</th><th>MID</th><th>Notice</th></tr>
			<c:forEach items="${applications}" var="apps">
			<tr><td><c:out value="${apps.email}"></c:out></td>
			<td><c:out value="${apps.firtsname}"></c:out></td>
			<td><c:out value="${apps.lastsname}"></c:out></td>
			<td><c:out value="${apps.phonenumber}"></c:out></td>
			<td><c:out value="${apps.currentlocation}"></c:out></td>
			<td><c:out value="${apps.applicaiondate}"></c:out></td>
			<td><c:out value="${apps.experience}"></c:out></td>
			<td><c:out value="${apps.mid}"></c:out></td>
			<td><c:out value="${apps.noiceperiod}"></c:out></td>
			
			<%-- <td><c:out value="${apps.file}"></c:out></td> --%>
			</tr>
			</c:forEach>
	</tbody>
	
</table>

<script src="ajax.js"></script>
</body>
</html>