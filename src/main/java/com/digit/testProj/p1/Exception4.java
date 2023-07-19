package com.digit.testProj.p1;

class OverAgeException extends Exception {
	public String getMessage() {
		return "YOU ARE OVER AGED";
	}
}

public class Exception4{
	public static void check()throws OverAgeException {
		int a = 10;
		int b = 20;
		if(b>a) {
			throw new OverAgeException();
		}
		
	}
public static void main(String[] args) {
	
	try {
	check();	
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
