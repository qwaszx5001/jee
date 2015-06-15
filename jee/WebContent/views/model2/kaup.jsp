<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>카우프 지수 구하기</title>
	<style>
		@IMPORT url("../../css/model2/kaup.css");
	</style>
</head>
<body>
		
	<form action="<%=request.getContextPath()%>/model2/kaup.do">
		<table>
			<tr>
				<td>키</td>
				<td>
					<%=request.getParameter("height") %>
				</td>
			</tr>
			<tr>
				<td>몸무게</td>
				<td>
					<%=request.getParameter("weight") %>
				</td>
			</tr>
			<tr>
				<td colspan="2">
				<!-- 카우프지수는 몇이고 정상 입니다.-->
					<%=(String)request.getAttribute("msg")%>
				</td>
			</tr>
		</table>
	
	
	</form>
	
</body>
</html>