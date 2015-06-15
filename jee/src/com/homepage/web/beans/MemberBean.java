package com.homepage.web.beans;

public class MemberBean {
	
	private String name;
	private String addr;
	private int age;
	private String id;
	private String password;

	public MemberBean(){}
	
	public MemberBean(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public MemberBean(String name, String addr, int age, String id, String password){
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.id = id;
		this.password = password;
	}
	

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
