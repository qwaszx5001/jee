<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>예약결과</title>
</head>
<body>
	
	<div>
	
		<hr style="width:400px; height:20px; border-color:black;" />
			
		<div style="text-align:center;">
			
			<%
			
			String[][] seat = new String[3][5]; // 전체 좌석
			String[][] mySeat = new String[0][0]; // 예약된 좌석
			int floor = Integer.parseInt((String)(request.getAttribute("floor")));
			int row = Integer.parseInt((String)(request.getAttribute("row")));
			seat[floor][row] = (String)request.getAttribute("id");
			
			for ( int i=0; i < seat.length; i++) {
				for (int j=0; j < seat[i].length; j++) {
					if (seat[i][j] == null) {
						/* System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
								+ " □\t" + "\t"); */
						%>
						ㅁ <%=i+1 %> - <%=j+1 %> 
						<%
					} else {
						/* System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
								+ " ■\t" + name[i][j] + "\t"); */
						%>
						■ <%=i+1 %> - <%=j+1 %> 
						<%		
					}
				}
				
				%>
				<br />
				<%
				//System.out.println();
			}
			%>
		</div>
	</div>
	
</body>
</html>