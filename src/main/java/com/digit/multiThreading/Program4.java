package com.digit.multiThreading;

class MSOffice extends Thread{
	
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("saving")) {
			saving();
		}
		else {
			checking();
		}
	}
	
	public void typing() {
		for(int i=0;i<5;i++) {
			System.out.println("Typing....");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				
			}
		}
	}
	
	public void checking() {
		for(int i=0;i<5;i++) {
			System.out.println("Checking....");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				
			}
		}
	}
	
	public void saving() {
		for(int i=0;i<5;i++) {
			System.out.println("Saving....");
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				
			}
		}
	}
	
}


public class Program4 {
public static void main(String[] args) {
	MSOffice m1 = new MSOffice();
	m1.setName("typing");
	MSOffice m2 = new MSOffice();
	m2.setName("checking");
	MSOffice m3 = new MSOffice();
	m3.setName("saving");	
	
	m1.start();
	m2.start();
	m3.start();
}
}
