package com.concurrent2;

public class Breakfast extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("Making breakfast");
			Thread.sleep(4000);
			System.out.println("Breakfast end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
