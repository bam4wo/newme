package com.www;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TrySet {
	
	public static void main(String[] args) {
		/*Set<String> set = new HashSet<>();
		set.add("bam");
		set.add("fine");
		System.out.println(set);*/
		
		Set<Integer> set = new HashSet<>();
		Random ran = new Random();
		for(int i=0;i<10000;i++) {
			int a = ran.nextInt(20);
		}
	}
}
