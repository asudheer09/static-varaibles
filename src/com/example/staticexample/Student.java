package com.example.staticexample;

public class Student {

	private int sid;
	private String name;
	public static String collegeName="Akshaya";
	
	public Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", college name= "+collegeName+"]";
	}
	
	
	
	
}
