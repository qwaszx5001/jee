<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>에러페이지</title>
</head>
<body>
	
	에러타입 : <%=exception.getClass().getName() %>
	에러 메시지 : <%=exception.getMessage() %> <br />
	<img src="<%=request.getContextPath() %>/images/errorPage.png" width="100%" alt="" border="0" />
	
</body>
</html>