package com.homepage.web.services;

import com.homepage.web.beans.MemberBean;

public interface MemberService {
	public static final int LOGIN_SUCCESS = 0;
	public static final int LOGIN_INVALID_ID_PASSWORD = 1;
	public static final int LOGIN_INVALID_PASSWORD = 2;
	
	public void join(String id, String password, String name, int age, String addr);
	public MemberBean login(String id, String password);
}
