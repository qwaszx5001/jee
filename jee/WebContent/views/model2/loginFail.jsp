<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인 실패 시 보여지는 페이지</title>
</head>
<body>
	<%= (String)request.getAttribute("loginResultMsg")%>
	<!-- 
	로그인 실패의 원인이 
	ID 값이 틀린 건지, 비밀번호가 틀린 건지 알려주세요
	
	실패 : loginFail.jsp, 성공 : member.jsp
	 -->
</body>
</html>