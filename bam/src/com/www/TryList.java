package com.www;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TryList {

	public static void main(String[] args) {
		/*List<Integer> list = new ArrayList<>(); 
		list.add(2);
		list.add(5);
		System.out.println(list);*/
		List<Integer> list = new ArrayList<>();
		Random ran = new Random(20);
		
		int[] num = new int[20];
		for(int c=0;c<20;c++) {
			list.add(0);
		}
		
		for(int i=0;i<10000;i++) {
			int a = ran.nextInt(20);
			Integer freq = list.get(a);
			list.set(a, freq+1);
		}	
		
		for(int n=0;n<num.length;n++) {
			System.out.println(n+"="+list.get(n));
			
		}
		
	}

}
