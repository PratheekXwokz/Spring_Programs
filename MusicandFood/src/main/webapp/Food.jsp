<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Food Details Are Mentioned Below</h1><br>
OrderedFoodName:${Food.foodName}<br>
NoOfItemsAdded:${Size}
<form action= "food.do" method="post">
<pre>
FoodName:<input type="text" name="foodName"/><br>
FoodPrice:<input type="text" name="price"/><br>
HotelName:<input type="text" name="hotelName"/><br>
Location:<select name="location">
			<option>Girinagar</option>
			<option>BTM Layout</option>
			<option>Jayanagar</option>
			<option>JpNagar</option>
			<option>VVpuram Street</option>
		</select>
<br>
OrderType:<select name="order">
			<option>Offline</option>
			<option>Swiggy</option>
			<option>Zomato</option>
		</select>
<br>
Quantity:<select name="quantity">
			<option>250g</option>
			<option>500g</option>
			<option>1KG</option>
		</select>
<br>
<input type="submit" value="Save"/>
</pre>
</form>
</body>
</html>
