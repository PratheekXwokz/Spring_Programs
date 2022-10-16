 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<a href="criminal">Criminal Details</a><br><br>
Status:${message}
<form action="criminal" method="post">
Name<input type="text" name="name"/><br><br>
Age<select name="age">
<option>select</option>
<c:forEach begin="12" end="100" var="index">
<option value="${index}">${index}</option>
</c:forEach>
</select><br><br>
Country<select name="country">
<option>India</option>
<option>USA</option>
<option>Germany</option>
<option>Pakistan</option>
<option>UK</option>
<option>Canada</option>
<option>Russia</option>
<option>Italy</option>
<option>China</option>
<option>Japan</option>
</select><br><br>
Criminal Type<select name="criminalType">
<option>Rowdy</option>
<option>Murderer</option>
<option>Rapist</option>
<option>Serial Killer</option>
<option>Terrorist</option>
<option>Hawala Agent</option>
<option>Contract Killer</option>
<option>Robbery</option>
<option>Psycopath</option>
<option>Organised Crime</option>
</select><br><br>
No of cases<select name="noOfCases">
<option>select</option>
<c:forEach begin="1" end="100" var="index">
<option value="${index}">${index}</option>
</c:forEach>
</select><br><br>
Alive:
<br>
Yes<input type="radio" name="alive" value="Yes"/>
Deceased<input type="radio" name="alive" value="Deceased"/>
Not Known<input type="radio" name="alive" value="Not Known"/>
<br><br>
Gender:
<br>
Female:<input type="radio" name="gender" value="Female"/>
Male:<input type="radio" name="gender" value="Male"/>
Other:<input type="radio" name="gender" value="Others"/>
<br>
International:
<br>
Yes<input type="radio" name="international" value="Yes"/>
No<input type="radio" name="international" value="No"/>
<br><br>
Married:
<br>
Yes<input type="radio" name="married" value="Yes"/>
No<input type="radio" name="married" value="No"/>
<br><br>
Jail term<select name="jailTerm">
<option>select</option>
<c:forEach begin="1" end="100" var="index">
<option value="${index}">${index}</option>
</c:forEach>
</select><br><br>
Wife Name<input type="text" name="wifeName"><br><br>
Right Hand Name<input type="text" name="rightHandName"><br><br>
Left Hand Name<input type="text" name="leftHandName"><br><br>
Prison<input type="text" name="prisonName"><br><br>
Net Worth<input type="text" name="netWorth"><br><br>
<input type="submit" value="Save record">
</form>
</body>
</html>