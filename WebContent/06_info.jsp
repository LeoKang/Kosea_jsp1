<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet</title>
<script type="text/javascript" src="param.js"></script>
</head>
<body>
	<form method="get" action="InfoServlet">
	아이디 : <input type="text" name="name"><br>
	나이 : <input type="text" name="addr"><br>
	<input type="submit" value="전송"><br>
	</form>
	<br>
	<form method="post" action="InfoServlet">
	이름 : <input type="text" name="name"><br>
	주소 : <input type="text" name="addr"><br>
	<input type="submit" value="전송"><br>
	</form>
</body>
</html>