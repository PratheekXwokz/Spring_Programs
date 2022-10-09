<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Food Details Are Mentioned Below</h1>
	<h1>Here Are The Details Of Music</h1>
	<Table border=1>
		<thead>
			<tr>
				<th>FoodName</th>
				<th>Price</th>
				<th>HotelName</th>
				<th>Location</th>
				<th>OrderType</th>
				<th>Quantity</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${List}" var="food">
			<tr>
				<td>${food.foodName}</td>
				<td>${food.price}</td>
				<td>${food.hotelName}</td>
				<td>${food.location}</td>
				<td>${food.order}</td>
				<td>${food.quantity}</td>
				</tr>
			</c:forEach>
		</tbody>
	</Table>
</body>
</html>