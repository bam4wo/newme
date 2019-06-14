package com.concurrent2;

public class Wizard extends Thread{
/*
    @Override
    public void run() {
    	synchronized(this) {
			System.out.println("THUNDER START");
	        try {
	            Thread.sleep(2000);
	        }catch (InterruptedException e){
	            e.printStackTrace();
	        }
	        System.out.println("THUNDER END");
    	}
    }

    public static void main(String[] args) {
        Wizard w1 = new Wizard();
        w1.start();
        Wizard w2 = new Wizard();
        w2.start();
    }*/
	
	public void run() {
		 synchronized(this){
			 System.out.println("THUNDER START!");
		     try {
		         Thread.sleep(2000);
		     }catch (InterruptedException e){
		         e.printStackTrace();
		     }
		     System.out.println("THUNDER END");
		}
	}
	 
	 public static void main(String[] args) {
	        Wizard w1 = new Wizard();
	        w1.start();
	        Wizard w2 = new Wizard();
	        w2.start();
	 }
}
 