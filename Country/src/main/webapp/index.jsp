<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<h1>Please Enter the value for the given fields</h1>
<body>
<form action="display.do" method="post">
Name<input type="text" name="name"/><br><br>
Email<input type="text" name="email"/><br><br>
City
<c:forEach items="${cities}" var="city">
< form: select name="cities">
			<option>${city.cities}</option>
			</select>
</c:forEach><br>
<input type="submit" value="save">
</form>
</body>
</html>