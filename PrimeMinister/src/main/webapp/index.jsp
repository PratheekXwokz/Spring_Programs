<html>
<body>
<form action="prime" method="post">
PrimeMinister Name:<input type = "text" id="name" name="name" placeholder="Enter Prime Minister Name"/>
<br>
Country:<input type="text" id="count" name="country" placeholder="Enter the Country">
<br>
Marriage Status:
Single:<input type="radio" name="status" value="Single"/>
Married:<input type="radio" name="status" value="Married"/>
<br>
<label for="Party">Select Your Party</label>
Party:<select name="party" id="part">
				<option value="bjp">BJP</option>
				<option value="janata">Janata Paksha</option>
				<option value="bsp">BSP</option>
				<option value="cong">Congress</option>
			  </select>
<br>
Age:<input type="text" id="ag" name="age" placeholder="Enter the Age"/>
<br>
Gender:
<br>
Female:<input type="radio" name="gender" value="Female"/>
Male:<input type="radio" name="gender" value="Male"/>
Other:<input type="radio" name="gender" value="Others"/>
<br>
Duration:<input type="text" id="time" name="duration" placeholder="Enter The Time Span"/>
<br>
<label for="Representer">No Of Times Elected </label>
Elected As PM<select name="elected" id="time">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
			  </select>
<br>
<input type="submit" value="send"/>
</form>
</body>
</html>
</html>