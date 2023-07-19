package com.digit.multiThreading;

import java.util.Scanner;

public class Program1 {
public static void main(String[] args) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Bank Operation");
	System.out.println("Enter the acc no");
	int accno = sc.nextInt();
	
	System.out.println("Enter the pin");
	int pin = sc.nextInt();
	
	System.out.println("Banking Completed");
	
	System.out.println("Printing Operation");
	for(int i=0;i<5;i++) {
		System.out.println("Good Morning");
		Thread.sleep(2000);
	}
	System.out.println("Print Completed");
	
	System.out.println("Enter the amount");
	int am1 = sc.nextInt();
	System.out.println("Enter the amount ");
	int am2 = sc.nextInt();
	int res = am1+am2;
	
	System.out.println("The Res = "+res);
	}
}
