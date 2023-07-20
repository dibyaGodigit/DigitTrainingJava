package com.digit.multiThreading;
/**
 * Producer Consumer prob
 */
class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
		a = q;
	}
	
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
		}
	}
}

class Consumer extends Thread{
	Queue b;
	
	public Consumer(Queue q) {
		b = q;
	}
	
	public void run() {
		while(true) {
			b.get();
		}
	}
}

class Queue {
	int x = 0;
	
	public void get() {
		System.out.println("Consumer Consumed The Value : "+x);
	}
	
	public void put(int i) {
		x = i;
		System.out.println("Producer has Produced the value "+x);
	}
}
public class ProducerConsumerProb {
public static void main(String[] args) {
	Queue  q = new Queue();
	
	Producer p = new Producer(q);
	Consumer c = new Consumer(q);
	
	
	p.start();
	c.start();
}
}
