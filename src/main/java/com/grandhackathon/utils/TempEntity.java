package com.grandhackathon.utils;

public class TempEntity {

	private String s1;
	private String s2;
	
	TempEntity(String s1, String s2){
		this.s1 = s1;
		this.setS2(s2); 
	}

	public String get1S() {
		return s1;
	}

	public void setS1(String s) {
		this.s1 = s;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	
}

