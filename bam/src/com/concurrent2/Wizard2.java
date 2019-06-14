package com.concurrent2;

public class Wizard2 extends Thread {
	@Override
	public void run() {
		thunder();
	}
	
	public synchronized void thunder(){
		System.out.println("THUNDER START!");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("END");
	}
	
	public static void main(String[] args) {
		 Wizard2 w1 = new Wizard2();
	     w1.start();
	     Wizard2 w2 = new Wizard2();
	     w2.start();
	}
}
		     
