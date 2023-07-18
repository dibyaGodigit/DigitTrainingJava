package com.digit.testProj.p1;

public class Exception2 {

	public static void fun()throws Exception{
		int num = 10;
		int dn = 0;
		
		int res = num /dn; 
	}
	
	public static void fun2() throws Exception{
		fun();
	}
	
	public static void fun3() throws Exception {
		fun2();
	}
	
	public static void main(String[] args) throws Exception {
	fun3();
}
}
