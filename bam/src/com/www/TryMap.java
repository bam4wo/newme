package com.www;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TryMap {

	public static void main(String[] args) {
		Map<Integer,Integer> map  = new HashMap<>();
		Random random = new Random(20);
		for(int i=0; i<10000; i++) {
			int a = random.nextInt(20);
			Integer freq = map.get(a);
			if(freq == null) {
				map.put(a, 1);
			}else {
				map.put(a, freq+1);
			}
		}
		System.out.println(map);

	}

}
//freq����a�ƥX�{���ơAfreq��null�ɡAfrer��1�Aelse freq+1