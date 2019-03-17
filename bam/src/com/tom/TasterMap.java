package com.tom;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TasterMap {

	public static void main(String[] args) {
		/*Map<Integer, Integer> map = new HashMap<>();
		map.put(2, 4);
		map.put(4, 7);
		System.out.println(map);*/
		
		Random random = new Random(20);
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<10000; i++) {
			int a = random.nextInt(20);
			Integer freq = map.get(a);
			if(freq==null) {
				map.put(a, 1);
			}else {
				map.put(a, freq+1);
			}
			
		}
		System.out.println(map);
	}

}
