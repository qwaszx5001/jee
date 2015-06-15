package com.homepage.web.exceptions;

public class LoginException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	private String msg;

	public LoginException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
