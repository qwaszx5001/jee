package com.homepage.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.serviceimpls.KaupServiceImpl;
import com.homepage.web.services.KaupService;

/**
 * @Date : 2015-06-15
 * @Author : 김기태
 * @Story : 키와 몸무게가 입력되면 카우프 지수와 메시지를 웹 브라우저에 렌더링하는 역할
 */

@WebServlet("/model2/kaup.do")
public class KaupController extends HttpServlet {
	
	private KaupService service;
	
	private static final long serialVersionUID = 1L;
	
	public KaupController(){
		service = new KaupServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		
		service.getKaupIndex(height, weight);
		request.setAttribute("msg", service.getResultMsg());
		
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/kaup.jsp");
		dispatcher.forward(request, response);*/
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		dispatcher.forward(request, response);
		
	}


}
