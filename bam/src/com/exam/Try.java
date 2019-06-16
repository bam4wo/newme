package com.exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Try {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Jack");
		set.add("Banana");
		set.add("Tomato");
		System.out.println(set.contains("Jack"));//會無法編譯，因為contains()方法必定使用equals方法來檢查是否相等
	}
}
	
