<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.homepage.web.beans.MemberBean" %>    
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원정보관리 페이지</title>
</head>
<body>
		<fieldset>
			<legend>회원 가입</legend>
		
			<table>
				<tr>
					<td>이름</td>
					<td>
						<%-- <%= ((MemberBean)request.getAttribute("bean")).getName()%> --%>
						${bean.name }
					</td>
				</tr>
				<tr>
					<td>ID</td>
					<td>
						<%-- <%= ((MemberBean)request.getAttribute("bean")).getId()%> --%>
						${bean.id }
					</td>
				</tr>
				<tr>
					<td>Password</td>
					<td>
						<%-- <%= ((MemberBean)request.getAttribute("bean")).getPassword()%> --%>
						${bean.password }
					</td>
				</tr>
				<tr>
					<td>나이</td>
					<td>
						<%-- <%= ((MemberBean)request.getAttribute("bean")).getAge()%> 세 --%>
						${bean.age }
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td>
						<%-- <%= ((MemberBean)request.getAttribute("bean")).getAddr()%> --%>
						${bean.addr }
					</td>
				</tr>
			</table>
		
		</fieldset>
	
</body>
</html>