package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestList {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<20; i++) {
			list.add(0);
		}
		for(int i=0; i<10000; i++) {
			int a = random.nextInt(20);
			Integer b = list.get(a);
			list.set(a, b+1);
			//System.out.println(a+":"+list);
		}
		System.out.println(list);
	}

}
