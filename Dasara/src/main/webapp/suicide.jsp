<html>
<h1>This Application Collects the data of people committing suicide</h1>
<body>
Data:${data.name};
<form action="suicide.do" method="post">
Name: <input type="text" name="name"/><br><br>
Age: <input type="text" name="age"/><br><br>
Reason: <textarea rows="5" cols="25" name="reason"></textarea><br><br>
Gender:
Male<input type="radio" id="male" name="gender" value="Male"/>
Female<input type="radio" id="female" name="gender" value="Female"/>
Other<input type="radio" id="other" name="gender" value="Other"/>
<br><br>
No Of Attempts: <input type="text" name="attempts"/><br><br>
Date and Time: <input type="text" name="dateAndTime"/><br><br>
Type: <select name="type">
<option value="Poison">Poison</option>
<option value="Drowning">Drowning</option>
<option value="Jumping off the roof">Jumping</option>
<option value="Hanging">Hanging</option>
</select>
<br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>