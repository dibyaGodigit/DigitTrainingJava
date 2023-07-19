package com.digit.multiThreading;


/**
 *  Dead Lock
 */

class Warriors extends Thread{
	
	String res1 = "Brahmastra";
	String res2 = "Sarpastra";
	String res3 = "Pashupatastra";
	
	public void run() {
	if(Thread.currentThread().getName().equals("Arjuna")) {
		ArjunaAcq();
	}
	else {
		karnaAcq();
	}
	}
	
	 void karnaAcq() {
		try {
			synchronized(res1) {
			System.out.println("Karna Acquired "+res1);
			Thread.sleep(3000);
			synchronized (res2) {
				System.out.println("Karna Acquired "+res2);
				Thread.sleep(3000);
				synchronized(res3) {
					System.out.println("Karna Acquired "+res3);
					Thread.sleep(3000);
				}
			}
			
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	 void ArjunaAcq() {
		try {
			synchronized(res3) {
				System.out.println("Arjuna Acquired "+res3);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("Arjuna Acquired "+res2);
					Thread.sleep(3000);
					synchronized(res1) {
						System.out.println("Arjuna Acquired "+res1);
						Thread.sleep(3000);
					}
				}
			}
				
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class program7 {
public static void main(String[] args) {
	Warriors w1 = new Warriors();
	w1.setName("Arjuna");
	Warriors w2 = new Warriors();
	w2.setName("Karna");
	
	w1.start();
	w2.start();
}
}
