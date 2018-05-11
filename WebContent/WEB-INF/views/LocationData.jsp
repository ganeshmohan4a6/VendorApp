<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location Data</title>
</head>
<body>
	<h1>Welcome to Location Data Page!!</h1>
	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>TYPE</th>
			<th>CODE</th>
			<th>NOTE</th>
			<th>OPERATION</th>
		</tr>
	<c:forEach items="${locs}" var="loc">
		<tr>
			<td><c:out value="${loc.locId}"/></td>
			<td><c:out value="${loc.locName}"/></td>
			<td><c:out value="${loc.locType}"/></td>
			<td><c:out value="${loc.locCode}"/></td>
			<td><c:out value="${loc.locDsc}"/></td>
			<td><a href="deleteLoc?locId=${loc.locId}">DELETE</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>