package com.homepage.web.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.serviceimpls.ReservationServiceImpl;
import com.homepage.web.services.ReservationService;

/**
 * @Date : 2015-06-16
 * @author : 김기태
 * @Story : 예약요청을 JSP에서 받아서 처리하는 컨트롤러
 */
@WebServlet({ 
				"/reservation/inputCheck.do",
				"/reservation/checkIn.do",
				"/reservation/checkOut.do",
				"/reservation/showStatus.do"})
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public static String[][] seat = new String[3][5];
	private List<String[][]> seatList = new ArrayList<String[][]>();
	
	private ReservationService service = new ReservationServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int floor = Integer.parseInt(request.getParameter("floor"));
		int row = Integer.parseInt(request.getParameter("row"));
		String id = request.getParameter("id");

		seat[floor][row] = id;
		
		Iterator<String[][]> it = seatList.iterator();
		while (it.hasNext()) {
			String[][] emptySeat = (String[][])it.next();
			
			if(emptySeat.equals(seat)){
				seat[floor][row] = id;
				seatList.add(seat);
			}
		}
		
		switch (request.getServletPath()) {
			case "/reservation/checkIn.do":
				System.out.println("체크인 넘어옴...");
				String msg = service.checkIn(floor, row, id);
				request.setAttribute("msg", msg);
				request.setAttribute("seat", seat);
				request.setAttribute("floor", floor);
				request.setAttribute("row", row);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/reservation.jsp");
				dispatcher.forward(request, response);
				break; // 체크인
			case "/reservation/checkOut.do":
				String msg2 = service.checkOut(floor, row, id);
				RequestDispatcher dispatcher2 = request.getRequestDispatcher("/views/model2/reservation.jsp");
				dispatcher2.forward(request, response);
				break; // 체크아웃
			case "/reservation/showStatus.do":
				String[][] seat = service.showStatus();
				request.setAttribute("floor", floor);
				request.setAttribute("row", row);
				RequestDispatcher dispatcher3 = request.getRequestDispatcher("/views/model2/reservation.jsp");
				dispatcher3.forward(request, response);
				break;
			default:
				String[][] seat2 = service.showStatus();
				RequestDispatcher dispatcher4 = request.getRequestDispatcher("/views/model2/reservation.jsp");
				dispatcher4.forward(request, response);
				break;
		}
		
		
		
	}


}
