 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Criminal Details are</h1>
	<Table border=1>
		<thead>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Country</th>
				<th>Criminal Type</th>
				<th>No Of Cases</th>
				<th>Alive</th>
				<th>Gender</th>
				<th>International</th>
				<th>Married</th>
				<th>Jail Term</th>
				<th>Wife Name</th>
				<th>Right Hand Name</th>
				<th>Left Hand Name</th>
				<th>Prison</th>
				<th>Net Worth</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${criminaldetails}" var="criminal">
			<tr>
				<td>${criminal.name}</td>
				<td>${criminal.age}</td>
				<td>${criminal.country}</td>
				<td>${criminal.criminalType}</td>
				<td>${criminal.noOfCases}</td>
				<td>${criminal.alive}</td>
				<td>${criminal.gender}</td>
				<td>${criminal.international}</td>
				<td>${criminal.married}</td>
				<td>${criminal.jailTerm}</td>
				<td>${criminal.wifeName}</td>
				<td>${criminal.rightHandName}</td>
				<td>${criminal.leftHandName}</td>
				<td>${criminal.prisonName}</td>
				<td>${criminal.netWorth}</td>
				</tr>
			</c:forEach>
		</tbody>
	</Table>
</body>
</html>