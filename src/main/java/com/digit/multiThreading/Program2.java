package com.digit.multiThreading;

import java.util.Scanner;

class Operations1 extends Thread{
	Scanner sc = new Scanner(System.in);
	public void run() {
		banking();
	}
	
	public void banking() {
		System.out.println("Bank Operation");
		System.out.println("Enter the acc no");
		int accno = sc.nextInt();
		
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
		
		System.out.println("Banking Completed");
	}
}

class Operations2 extends Thread{
	public void run() {
		try{
			printing();	
		}catch(InterruptedException e) {}
	}
	public void printing () throws InterruptedException{
		System.out.println("Printing Operation");
		for(int i=0;i<5;i++) {
			System.out.println("Good Morning");
			Thread.sleep(2000);
		}
		System.out.println("Print Completed");
	}
}

class Operations3 extends Thread{
	Scanner sc = new Scanner(System.in);
	public void run() {
			add();
	}
	
	
	
	
	
	
	public void add() {
		System.out.println("Enter the amount");
		int am1 = sc.nextInt();
		System.out.println("Enter the amount ");
		int am2 = sc.nextInt();
		int res = am1+am2;
		
		System.out.println("The Res = "+res);
	}
	
}

public class Program2 {
public static void main(String[] args) {
	Operations1 op1 = new Operations1();
	op1.setName("banking");
	
	
	Operations2 op2 = new Operations2();
	op2.setName("printing");
	
	
	Operations3 op3 = new Operations3();
	op3.setName("add");
	
	
	op1.start();
	op2.start();
	op3.start();
	
	
}
}
