package com.digit.testProj.p1;

public class Exception3 {
	public static void fun(){
		try{int num = 10;
		int dn = 0;
		
		int res = num /dn;
		}
		catch(ArithmeticException e) {
			System.out.println("Aree maiyaaa ye kya dekh lio ...");
			throw e;
		}
	}
	
	
public static void main(String[] args) {
	
	try{fun();}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
