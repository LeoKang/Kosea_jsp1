<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<script type="text/javascript" src="form_check.js"></script>
</head>
<body>
	<form method="get" action="MemberCheck" name="frm">
		이름 : <input type="text" name="pname"><br> 주민등록번호 : <input
			type="text" name="psn"><br> 아이디 : <input type="text"
			name="pid"><br> 비밀번호 : <input type="password"
			name="ppwd"><br> 비밀번호확인 : <input type="password"
			name="ppwdchk"><br> <input type="submit" value="전송"
			onclick="return check()"><br>
	</form>
</body>
</html>