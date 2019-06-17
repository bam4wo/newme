package com.exam;

import java.util.HashSet;
import java.util.Set;

public class SetTry {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Apple");
		set.add("Banana");
		set.add("Tomato");
		System.out.println(set);
		
		Set<String> set2 = new HashSet<>();
		set2.add("Jack");
		set2.add("Eric");
		set2.add("Janet");
		//System.out.println(set2.get(1)); set沒有get語法，因此無法編譯
		System.out.println(set2);
	}

}
