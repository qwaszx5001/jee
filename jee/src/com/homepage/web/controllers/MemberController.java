package com.homepage.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.beans.MemberBean;
import com.homepage.web.exceptions.LoginException;
import com.homepage.web.serviceimpls.MemberServiceImpl;
import com.homepage.web.services.MemberService;

/**
 * @Date : 2015-06-15
 * @Author : 김기태(musicovery12@naver.com)
 * @Story : 회원가입과 로그인 담당하는 컨트롤러 
 *
 */
@WebServlet({"/model2/join.do", "/model2/login.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private MemberService service = new MemberServiceImpl();
	private MemberBean bean = new MemberBean();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
//		String urlForward = null;
		
		switch(request.getServletPath()){
		
			case "/model2/join.do":
				System.out.println("reached here 1");
				String name = request.getParameter("name");
				String id = request.getParameter("id");
				String password = request.getParameter("password");
				String ageParam = request.getParameter("age");
				String address = request.getParameter("address");
				
				System.out.println(name);
				System.out.println(id);
				System.out.println(password);
				System.out.println(ageParam);
				System.out.println(address);
				System.out.println("--------------------");
				
				
				service.join(id, password, name, Integer.parseInt(ageParam), address);
				
				MemberBean bean = new MemberBean(name, address, Integer.parseInt(ageParam), id, password);
				request.setAttribute("bean", bean);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("/views/model2/memberForm.jsp");
				dispatcher.forward(request, response);
				// urlForward = joinService(request);
				break;
			case "/model2/login.do":
				System.out.println("reached here 2");
				String id2 = request.getParameter("id");
				String pass = request.getParameter("password");
				
				
				String loginResultMsg = null;
				MemberBean bean2 = null;
				try{
					bean2 = service.login(id2, pass);
					if(bean2 != null){
						request.setAttribute("bean", bean2);
						loginResultMsg = "환영합니다. " +bean2.getAddr() + "에 사는 " + bean2.getAge() + "세 " + bean2.getName()+"님 .."; 
								
//								"환영합니다. " +bean.getAddr()+"에 사는 "+bean.getAge()+"세 "+bean.getName()+"님 ..";
					}
					
				}catch(LoginException e){
					loginResultMsg = e.getMsg();
				}
				
				request.setAttribute("loginResultMsg", loginResultMsg);
				
				//성공시 member 실패시 loginFailed.jsp 
				// urlForward = loginService(request);
				
				String urlForward = (bean2 != null)? "/views/model2/member.jsp": "/views/model2/loginFail.jsp";
				RequestDispatcher dispatcher2 = request.getRequestDispatcher(urlForward);
				dispatcher2.forward(request, response);
				
				break;
				
			default:
				throw new RuntimeException();
		}
		
		/*RequestDispatcher dispatcher = request.getRequestDispatcher(urlForward);
		dispatcher.forward(request, response);*/
	}

	/*private String loginService(HttpServletRequest request) {
		String urlForward = null;
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberBean bean = new MemberBean(id, password);
		
		
		String loginResultMsg = service.login(id, password);
		request.setAttribute("loginResultMsg", loginResultMsg);
		
		return "/views/model2/member.jsp";
	}

	private String joinService(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
				
		MemberBean bean = new MemberBean(id, password);
		
		loginList.add();
		
		return "/views/model2/member.jsp";
	}*/
	
	

}
