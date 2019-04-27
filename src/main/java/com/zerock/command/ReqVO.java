package com.zerock.command;

public class ReqVO {
	
	//해당 VO에 객체와 동일한 변수명이 있다면 컨트롤라가 타입에 따라 알아서 맵핑.
	//단, setter의 set을 제외한 이름이 같아야 함.
	
	private String id;
	private String pw;
	private String name;
	private String age;
	
	//alt shift s
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

	
	
	
	
}
