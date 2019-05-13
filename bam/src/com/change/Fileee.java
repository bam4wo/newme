package com.change;

import java.io.File;

public class Fileee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("aa.txt");
		if(file.exists()) {
			System.out.println(file.length());
			System.out.println(file.getAbsolutePath());
		}
		
		File f = new File("C:\\DB");
		if(f.exists() && f.isDirectory()) {
			File[] fs = f.listFiles();
			for(File ff : fs) {
				if(ff.isFile()) {
					System.out.println(ff.getName());
				}
			}
			System.out.println(f.mkdir());
		}
	}

}
