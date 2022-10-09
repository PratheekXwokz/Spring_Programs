<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Here Are The Details Of Music</h1>
<br>
<form action="music.do" method="post">
<pre>
SongName:<input type="text" name="songName"/><br>
SingerName:<input type="text" name="singerName"/><br>
SongDuration:<input type="text" name="duration"/><br>
Producer:<input type="text" name="producer"/><br>
LyricsWritter:<input type="text" name="lyricsWriter"/><br>
Language:<select name="language">
			<option>Kannada</option>
			<option>Hindi</option>
			<option>English</option>
		</select>
<br>		
SongType:<select name="type">
			<option>Party Song</option>
			<option>POP Song</option>
			<option>Patho Song</option>
			<option>Item Song</option>
			<option>Love Song</option>
		</select>
<br>
<input type="submit" value="Save"/>
</pre>
</form>
</body>
</html>