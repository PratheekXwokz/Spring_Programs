
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display User</title>
</head>
<body>
	<h1>User Details are</h1>
	<Table border=1>
		<thead>
			<tr>
				<th>User Name</th>
				<th>Email</th>
				<th>Image</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${logindetails}" var="login">
				<tr>
					<td>${login.userName}</td>
					<td>${login.email}</td>
					<td><img src="login/image?filename=${login.fileName}" width="200px" height="200px"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</Table>
</body>
</html>
