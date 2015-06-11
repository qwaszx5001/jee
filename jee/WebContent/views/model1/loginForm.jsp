<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인 폼</title>
</head>
<body>

<div>
	<form action="login.jsp">
		<table style="border: 1px solid black; border-collapse: collapse;">
			<tr style="border: 1px solid black; border-collapse: collapse;">
				<td style="border: 1px solid black; border-collapse: collapse;">ID :</td>
				<td style="border: 1px solid black; border-collapse: collapse;">
					<input type="text" name="memberId" id="memberId" placeholder="ID" />
				</td>
			</tr>
			<tr style="border: 1px solid black; border-collapse: collapse;">
				<td style="border: 1px solid black; border-collapse: collapse;">비밀번호 :</td>
				<td style="border: 1px solid black; border-collapse: collapse;">
					<input type="password" name="pass" id="pass" placeholder="PASSWORD" />
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" value="전송" />
				</td>
			</tr>
		</table>
	</form>
	
</div>
	
</body>
</html>