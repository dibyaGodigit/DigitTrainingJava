package com.digit.testProj.p1;

import java.util.Scanner;

public class Exceptions1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
	System.out.println("Enter the Numerator");
	int num = sc.nextInt();
	System.out.println("Enter the Denomerator");
	int dn = sc.nextInt();
	
	int res = num/dn;
	System.out.println("Enter the size of the array : ");
	int size = sc.nextInt();
	int[] arr = new int[size];
	
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	catch(NegativeArraySizeException e) {
		System.out.println("Negative Size");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	
}
}
