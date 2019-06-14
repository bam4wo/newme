package com.concurrent2;

public class Brush implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Brush teeth");
			Thread.sleep(3000);
			System.out.println("Brush end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
