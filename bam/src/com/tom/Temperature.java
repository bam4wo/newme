package com.tom;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Temperature {

	public static void main(String[] args) {
		Random ran = new Random();
		Map<Integer, Integer> m = new HashMap<>();
		for(int i=0; i<24; i++) {
			int a = ran.nextInt(6);
			Integer freq = m.get(a);
			if(freq==null) {
				m.put(a, 1);
			}else {
				m.put(a, freq+1);
			}
		}
		System.out.println(m);
		

	}

}
