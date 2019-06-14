package com.concurrent2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Holle World");
		Breakfast bf = new Breakfast();
		bf.start();
		Brush bru = new Brush();
		Thread thr = new Thread(bru);
		thr.start();
		try {
			bf.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}  
		/*如果沒放這個，Main end會亂跑，在其他程式碼跑完前就先執行了*/
		System.out.println("Main end");
		

	}

}
