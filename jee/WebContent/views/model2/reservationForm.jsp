<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>예약 폼</title>
</head>
<body>
		<div>
			<form action="">
				<fieldset>
					<legend>예약일</legend>
					<ol>
						<li>
						예약 취소는 영화시작 2시간 전까지 가능합니다.
						</li>
						<li>
							<label for="wanted">원하는 예약일</label>
							<input id="wanted" name="wanted" type="date" />
							<input type="time" name="time" id="time" />
						</li>
					</ol>
					
					<input type="submit" value="전송" />
					
				</fieldset>	
			</form>
		</div>
		
	
	
	<hr style="width:400px; height:20px; border-color:black;" />
	<div style="text-align:center;">
	
		// TODO : 코딩
		?님 (?)석 예약을 완료하였습니다.
		ㅁ A - 1
		■ B - 1
	</div>
	
	<div>
		<form action="<%=request.getContextPath() %>/reservation/checkIn.do">
			<fieldset>
				<legend>주문 내용</legend>
				<ol>
					<li>
						<label for="prod">좌석</label>
						<input type="text" name="id" id="id" placeholder="아이디를 입력하세요" />
					</li>
					<li>
						<label for="floor">열 번호</label>
						<input id="floor" name="floor" type="number" min="1" max="3" value="1"/>
					</li>
					<li>
						<label for="row">행 번호</label>
						<input id="row" name="row" type="number" min="1" max="5" value="1"/>
					</li>
					
				</ol>
				
				
			</fieldset>
	
			<input type="submit" value="등록" />
		</form>
	</div>
	
</body>
</html>