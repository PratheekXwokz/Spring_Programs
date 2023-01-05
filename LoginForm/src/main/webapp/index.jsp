<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Details</title>
</head>
<body>
<a href="login">Login Details</a>
<a href="SearchByName.jsp">Find By Name</a><br><br>
<form action="login" method="post" enctype="multipart/form-data">
UserName:<input type="text" name="userName"/><br><br>
email<input type="text" name="email"/><br><br>
Profile Picture<input type="file" name="image"/><br><br>
<input type="submit" value="Save"/>
</form>
</body>
</html>