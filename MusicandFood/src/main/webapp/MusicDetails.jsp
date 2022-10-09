<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Here Are The Details Of Music</h1>
	<Table border=1>
		<thead>
			<tr>
				<th>SongName</th>
				<th>SingerName</th>
				<th>Duration</th>
				<th>Producer</th>
				<th>LyricsWriter</th>
				<th>Language</th>
				<th>Type</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="music">
			<tr>
				<td>${music.songName}</td>
				<td>${music.singerName}</td>
				<td>${music.duration}</td>
				<td>${music.producer}</td>
				<td>${music.lyricsWriter}</td>
				<td>${music.language}</td>
				<td>${music.type}</td>
				</tr>
			</c:forEach>
		</tbody>
	</Table>
</body>
</html>