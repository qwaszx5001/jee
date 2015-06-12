package com.homepage.web.controllers;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.serviceimpls.HelloServiceImpl;
import com.homepage.web.services.HelloService;

@WebServlet({"/name/hello.nhn", "/hi.do"})
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		switch(request.getServletPath()){
			case "/name/hello.nhn":
				goHello(request, response);
				break;
			case "/hi.do":
				goHi(request, response);
				break;
			default:
				System.out.println("페이지 없음");
				break;
		}
	}

	private void goHi(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		
		// 맨 처음 "/"는 WebContent 폴더를 의미한다.
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/hi.jsp"); 
		dispatcher.forward(request, response);
	}

	private void goHello(HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException,
			ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		HelloService service = new HelloServiceImpl();
		String msg = service.greet();
		
		String name = request.getParameter("name");
		request.setAttribute("name", msg + name);
		
		// 맨 처음 "/"는 WebContent 폴더를 의미한다.
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/hello.jsp"); 
		dispatcher.forward(request, response);
	}

}
